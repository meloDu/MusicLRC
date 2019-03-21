package com.example.qqmusiclrc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

import com.example.qqmusiclrc.view.LRCTextView;

public class MainActivity extends Activity {
	private LRCTextView lrcTv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lrcTv = (LRCTextView) findViewById(R.id.lrcTv);
		// lrcTv.setLrc("你可以随便设置歌词");
		((SeekBar) findViewById(R.id.seekBar1))
				.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

					@Override
					public void onStopTrackingTouch(SeekBar seekBar) {

					}

					@Override
					public void onStartTrackingTouch(SeekBar seekBar) {

					}

					@Override
					public void onProgressChanged(SeekBar seekBar,
							int progress, boolean fromUser) {
						double pro = progress;
						double diver = 100;
						float p = (float) (pro / diver);
						lrcTv.setPercent(p);
					}
				});
	}
}
