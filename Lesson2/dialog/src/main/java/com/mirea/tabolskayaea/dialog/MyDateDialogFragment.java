package com.mirea.tabolskayaea.dialog;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;


public class MyDateDialogFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    Calendar dateAndTime=Calendar.getInstance();

    @NonNull
    @Override
    public Dialog onCreateDialog (Bundle savedInstanceState) {

    return new DatePickerDialog(requireContext(), this,
                dateAndTime.get(Calendar.YEAR),
                dateAndTime.get(Calendar.MONTH),
                dateAndTime.get(Calendar.DAY_OF_MONTH));
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

    }
}