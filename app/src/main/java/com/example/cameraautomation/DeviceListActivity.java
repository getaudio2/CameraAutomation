package com.example.cameraautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.hp.bluetoothjhr.BluetoothJhr;

public class DeviceListActivity extends AppCompatActivity {

    ListView listaDispositivos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_list);

        listaDispositivos = (ListView)findViewById(R.id.listaDispositivos);
        BluetoothJhr bluetoothJhr = new BluetoothJhr(this,listaDispositivos);
        bluetoothJhr.EncenderBluetooth();

        listaDispositivos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                bluetoothJhr.Disp_Seleccionado(view, i, MainActivity.class);
            }
        });
    }
}