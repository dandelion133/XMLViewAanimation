package comqian.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {

	
	private ImageView iv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv = (ImageView) findViewById(R.id.iv);
	}
	//透明度动画
	public void alpha(View v) {
		Animation animation =  AnimationUtils.loadAnimation(this, R.anim.alpha);
		//从全透明到全部透明
		
		iv.setAnimation(animation);
		
	}
	
	public void trans(View view) {
		//绝对位移
		/*TranslateAnimation animation = new TranslateAnimation(-100f,//fromXDelta  x轴起点
				100f, //toXDelta x轴重点
				-100f, //fromYDelta  y轴起点
				100f);//toYDelta y轴重点
*/		
		//相对位移  相对父空间ImageView的大小
		Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);
		iv.startAnimation(animation);
		
		
	}
	
	public void scale(View view) {
		Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale);
		iv.startAnimation(animation);
		
				
	}
	
	
	public void rotate(View view) {
		Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
		iv.startAnimation(animation);
	
		
	}
	
	public void set(View view) {
		Animation animation = AnimationUtils.loadAnimation(this, R.anim.set);
		iv.startAnimation(animation);
		
		
	}
	
	

}
