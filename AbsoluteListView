package com.xsb.thinktank.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class AbsoluteListView extends ListView {

	public AbsoluteListView(Context context) {
		super(context);
	}

	public AbsoluteListView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public AbsoluteListView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	/**
	 * 只需要重写这个方法即可
	 */
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}

}
