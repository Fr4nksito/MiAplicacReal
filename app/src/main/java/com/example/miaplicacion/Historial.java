package com.example.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import java.util.ArrayList;

public class Historial extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ColorHistoryAdapter adapter;
    private ArrayList<ColorHistoryItem> colorHistoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        colorHistoryList = new ArrayList<>();
        adapter = new ColorHistoryAdapter(colorHistoryList);
        recyclerView.setAdapter(adapter);

        loadColorHistory();
    }

    private void loadColorHistory() {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("colorHistory").orderBy("timestamp")
                .addSnapshotListener((value, error) -> {
                    if (error != null) {
                        Log.w("Firebase", "Listen failed.", error);
                        return;
                    }

                    colorHistoryList.clear();
                    for (QueryDocumentSnapshot doc : value) {
                        ColorHistoryItem item = doc.toObject(ColorHistoryItem.class);
                        colorHistoryList.add(item);
                    }
                    adapter.notifyDataSetChanged();
                });
    }
}