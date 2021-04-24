package edu.co.icesi.horizontalscrollview.row;

import android.view.View;

import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import edu.co.icesi.horizontalscrollview.R;


public class UserRow extends RecyclerView.ViewHolder {

    private TextView usernameTV;

    public UserRow(View itemView) {
        super(itemView);
        usernameTV = itemView.findViewById(R.id.usernameTV);
    }

    public TextView getUsernameTV() {
        return usernameTV;
    }
}
