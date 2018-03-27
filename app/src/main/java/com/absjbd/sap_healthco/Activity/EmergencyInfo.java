package com.absjbd.sap_healthco.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.absjbd.sap_healthco.R;

public class EmergencyInfo extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    Intent callIntent;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_emergency_info);
        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
        context = EmergencyInfo.this;
    }

    public void onClickNationalHotline(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("আপনি কি এই জরুরী কলটি করতে চান?")
                .setTitle("কল করুন")
                .setCancelable(true)
                .setPositiveButton("হ্যাঁ",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {
                                callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:999"));
                                if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    ActivityCompat.requestPermissions((Activity)context, new String[]{android.Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                } else {
                                    context.startActivity(callIntent);
                                }
                            }
                        });

        alertDialogBuilder.setNegativeButton("না", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    public void onClickBloodBank(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("আপনার কি জরুরীভাবে রক্তের প্রয়োজন??")
                .setTitle("কল করতে চান?")
                .setCancelable(true)
                .setPositiveButton("হ্যাঁ",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {
                                callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:031-651242"));
                                if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    ActivityCompat.requestPermissions((Activity)context, new String[]{android.Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                } else {
                                    context.startActivity(callIntent);
                                }
                            }
                        });

        alertDialogBuilder.setNegativeButton("না", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    public void onClickBloodBankTwo(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("আপনার কি জরুরীভাবে রক্তের প্রয়োজন??")
                .setTitle("কল করতে চান?")
                .setCancelable(true)
                .setPositiveButton("হ্যাঁ",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {
                                callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:01857-529998"));
                                if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    ActivityCompat.requestPermissions((Activity)context, new String[]{android.Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                } else {
                                    context.startActivity(callIntent);
                                }
                            }
                        });

        alertDialogBuilder.setNegativeButton("না", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    public void onClickBloodBankThree(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("আপনার কি জরুরীভাবে রক্তের প্রয়োজন??")
                .setTitle("কল করতে চান?")
                .setCancelable(true)
                .setPositiveButton("হ্যাঁ",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {
                                callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:01625-524255"));
                                if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    ActivityCompat.requestPermissions((Activity)context, new String[]{android.Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                } else {
                                    context.startActivity(callIntent);
                                }
                            }
                        });

        alertDialogBuilder.setNegativeButton("না", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    public void onClickCmc(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("আপনি কি এই জরুরী কলটি করতে চান?")
                .setTitle("কল করুন")
                .setCancelable(true)
                .setPositiveButton("হ্যাঁ",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {
                                callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:999"));
                                if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    ActivityCompat.requestPermissions((Activity)context, new String[]{android.Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                } else {
                                    context.startActivity(callIntent);
                                }
                            }
                        });

        alertDialogBuilder.setNegativeButton("না", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }
}
