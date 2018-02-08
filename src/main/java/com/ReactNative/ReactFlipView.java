package com.ReactNative;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.ReactNative.flip.FlipView;
import com.ReactNative.views.NumberTextView;


public class ReactFlipView extends FlipView {

    protected FlipView flipView;

    public ReactFlipView(final Context context) {
        super(context);

        flipView = new FlipView(getContext());

        flipView.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 10;
            }

            @Override
            public Object getItem(int position) {
                return position;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                final NumberTextView view;
                if (convertView == null) {
                    final Context context = parent.getContext();
                    view = new NumberTextView(context, position);
                    view.setTextSize(TypedValue.COMPLEX_UNIT_SP, 64f);
                } else {
                    view = (NumberTextView) convertView;
                    view.setNumber(position);
                }
                view.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, " click ", Toast.LENGTH_SHORT).show();
                    }
                });

                return view;
            }
        });

    }
}
