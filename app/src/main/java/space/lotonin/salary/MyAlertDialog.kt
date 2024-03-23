import android.app.Dialog
import android.os.Bundle
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import androidx.appcompat.app.AlertDialog
import space.lotonin.salary.MainActivity

class MyAlertDialog: DialogFragment (){
    var et: EditText? = null
    var et2: EditText? = null
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle("Что добавить/удалить?")
                .setMessage("")
                .setCancelable(true)
                .setPositiveButton("Холодильник"){
                    dialog, id -> dialog.cancel()
                    val a = activity as MainActivity
                    a.FrostClick(et)
                    dialog.cancel()
                }
                .setNegativeButton(
                    "Второй рейс"
                ) {
                        dialog, id ->
                    val a = activity as MainActivity
                    a.SecondClick(et2)
                    dialog.cancel()
                }
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}