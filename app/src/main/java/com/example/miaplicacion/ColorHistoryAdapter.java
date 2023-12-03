package com.example.miaplicacion;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ColorHistoryAdapter extends RecyclerView.Adapter<ColorHistoryAdapter.ViewHolder> {

    private final List<ColorHistoryItem> colorHistoryList;

    public ColorHistoryAdapter(List<ColorHistoryItem> colorHistoryList) {
        this.colorHistoryList = colorHistoryList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.color_history_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ColorHistoryItem item = colorHistoryList.get(position);
        holder.colorNameTextView.setText(item.getColorName());
        holder.hexValueTextView.setText(item.getHexValue());
    }

    @Override
    public int getItemCount() {
        return colorHistoryList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView colorNameTextView, hexValueTextView;

        public ViewHolder(View view) {
            super(view);
            colorNameTextView = view.findViewById(R.id.colorNameTextView);
            hexValueTextView = view.findViewById(R.id.hexValueTextView);
        }
    }
}