package com.conversation.conversion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.conversation.R;

import java.util.ArrayList;
import java.util.List;

public class ConversationalAdapter extends RecyclerView.Adapter<ConversationalAdapter.MyViewHolder> {

    private List<Data> list = new ArrayList<>();

    public void update(List<Data> list) {
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ConversationalAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_conversional_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ConversationalAdapter.MyViewHolder holder, int position) {

        holder.bind(list.get(position), position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        FrameLayout frameLayoutLeftExpired;
        FrameLayout frameLayoutRightExpired;

        FrameLayout frameLayoutLeftSuccess;
        FrameLayout frameLayoutRightSuccess;

        FrameLayout frameLayoutLeftPending;
        FrameLayout frameLayoutRightPending;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            frameLayoutLeftExpired = itemView.findViewById(R.id.frameLayoutLeftExpired);
            frameLayoutRightExpired = itemView.findViewById(R.id.frameLayoutRightExpired);

            frameLayoutLeftSuccess = itemView.findViewById(R.id.frameLayoutLeftSuccess);
            frameLayoutRightSuccess = itemView.findViewById(R.id.frameLayoutRightSuccess);

            frameLayoutLeftPending = itemView.findViewById(R.id.frameLayoutLeftPending);
            frameLayoutRightPending = itemView.findViewById(R.id.frameLayoutRightPending);

        }

        public void bind(Data data, int position) {

            frameLayoutLeftExpired.setVisibility(View.GONE);
            frameLayoutRightExpired.setVisibility(View.GONE);

            frameLayoutLeftSuccess.setVisibility(View.GONE);
            frameLayoutRightSuccess.setVisibility(View.GONE);

            frameLayoutLeftPending.setVisibility(View.GONE);
            frameLayoutRightPending.setVisibility(View.GONE);

            if (data.getType().equals("LEFT") && data.getPaymentStatus().equals("EXPIRED")) {
                frameLayoutLeftExpired.setVisibility(View.VISIBLE);
            } else if (data.getType().equals("RIGHT") && data.getPaymentStatus().equals("SUCCESS")) {
                frameLayoutRightSuccess.setVisibility(View.VISIBLE);
            } else if (data.getType().equals("LEFT") && data.getPaymentStatus().equals("PENDING")) {
                frameLayoutLeftPending.setVisibility(View.VISIBLE);
            }
        }
    }
}
