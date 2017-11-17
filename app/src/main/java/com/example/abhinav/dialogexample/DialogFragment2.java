package com.example.abhinav.dialogexample;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by Abhinav on 10/25/2017.
 */

public class DialogFragment2 extends DialogFragment {


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle("Custom Alert Dialog 2");
        builder.setItems(R.array.items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if(which==0)
                {
                    Toast.makeText(getActivity(),"red",Toast.LENGTH_SHORT).show();
                }
                else if(which==1)
                {
                    Toast.makeText(getActivity(),"green",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getActivity(),"blue",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return builder.create();
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
    }


}
