package com.yimi.campusorder;

import com.yimi.campusorder.home.HomeActivity;
import com.yimi.campusorder.mine.MineActivity;
import com.yimi.campusorder.search.SearchActivity;
import com.yimi.campusorder.setting.SettingActivity;
import com.yimi.campusorder.shopCart.ShopCartActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;

/**
 * @author Flex.Zang 2013-8-4
 */
public class MainActivity extends TabActivity implements OnClickListener {
	private static String TAB_TAG_HOME = "home";
	private static String TAB_TAG_SEARCH = "search";
	private static String TAB_TAG_SHOPPING_CART = "shopCart";
	private static String TAB_TAG_MINE = "mine";
	private static String TAB_TAB_SETTING = "setting";
	private static TabHost mTabHost;
	private static final int COLOR1 = Color.parseColor("#787878");
	private static final int COLOR2 = Color.parseColor("#ffffff");
	ImageView mBut1, mBut2, mBut3, mBut4, mBut5;
	TextView mCateText1, mCateText2, mCateText3, mCateText4, mCateText5;
	Intent mHomeItent, mSearchIntent, mShopCartIntent, mMineIntent,
			mSettingIntent;

	int mCurTabId = R.id.channel1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		prepareIntent();
		prepareView();
		setUpIntent();
	}

	@Override
	public void onClick(View v) {
		if (mCurTabId == v.getId()) {
			return;
		}
		// clean the effects
		mBut1.setImageResource(R.drawable.icon_1_n);
		mBut2.setImageResource(R.drawable.icon_2_n);
		mBut3.setImageResource(R.drawable.icon_3_n);
		mBut4.setImageResource(R.drawable.icon_4_n);
		mBut5.setImageResource(R.drawable.icon_5_n);
		mCateText1.setTextColor(COLOR1);
		mCateText2.setTextColor(COLOR1);
		mCateText3.setTextColor(COLOR1);
		mCateText4.setTextColor(COLOR1);
		mCateText5.setTextColor(COLOR1);

		int checkedId = v.getId();
		switch (checkedId) {
		case R.id.channel1:
			mTabHost.setCurrentTabByTag(TAB_TAG_HOME);
			mBut1.setImageResource(R.drawable.icon_1_c);
			mCateText1.setTextColor(COLOR2);
			break;
		case R.id.channel2:
			mTabHost.setCurrentTabByTag(TAB_TAG_SEARCH);
			mBut2.setImageResource(R.drawable.icon_2_c);
			mCateText2.setTextColor(COLOR2);
			break;
		case R.id.channel3:
			mTabHost.setCurrentTabByTag(TAB_TAG_SHOPPING_CART);
			mBut3.setImageResource(R.drawable.icon_3_c);
			mCateText3.setTextColor(COLOR2);
			break;
		case R.id.channel4:
			mTabHost.setCurrentTabByTag(TAB_TAG_MINE);
			mBut4.setImageResource(R.drawable.icon_4_c);
			mCateText4.setTextColor(COLOR2);
			break;
		case R.id.channel5:
			mTabHost.setCurrentTabByTag(TAB_TAB_SETTING);
			mBut5.setImageResource(R.drawable.icon_5_c);
			mCateText5.setTextColor(COLOR2);
			break;
		default:
			break;
		}
		mCurTabId = checkedId;
	}

	private void prepareIntent() {
		mHomeItent = new Intent(this, HomeActivity.class);
		mSearchIntent = new Intent(this, SearchActivity.class);
		mShopCartIntent = new Intent(this, ShopCartActivity.class);
		mMineIntent = new Intent(this, MineActivity.class);
		mSettingIntent = new Intent(this, SettingActivity.class);
	}

	private void prepareView() {
		mBut1 = (ImageView) findViewById(R.id.imageView1);
		mBut2 = (ImageView) findViewById(R.id.imageView2);
		mBut3 = (ImageView) findViewById(R.id.imageView3);
		mBut4 = (ImageView) findViewById(R.id.imageView4);
		mBut5 = (ImageView) findViewById(R.id.imageView5);
		findViewById(R.id.channel1).setOnClickListener(this);
		findViewById(R.id.channel2).setOnClickListener(this);
		findViewById(R.id.channel3).setOnClickListener(this);
		findViewById(R.id.channel4).setOnClickListener(this);
		findViewById(R.id.channel5).setOnClickListener(this);
		mCateText1 = (TextView) findViewById(R.id.textView1);
		mCateText2 = (TextView) findViewById(R.id.textView2);
		mCateText3 = (TextView) findViewById(R.id.textView3);
		mCateText4 = (TextView) findViewById(R.id.textView4);
		mCateText5 = (TextView) findViewById(R.id.textView5);
	}

	private void setUpIntent() {
		mTabHost = getTabHost();
		mTabHost.addTab(buildTabSpec(TAB_TAG_HOME, R.string.category_home,
				R.drawable.icon_1_n, mHomeItent));
		mTabHost.addTab(buildTabSpec(TAB_TAG_SEARCH, R.string.category_search,
				R.drawable.icon_2_n, mSearchIntent));
		mTabHost.addTab(buildTabSpec(TAB_TAG_SHOPPING_CART,
				R.string.category_shopcart, R.drawable.icon_3_n,
				mShopCartIntent));
		mTabHost.addTab(buildTabSpec(TAB_TAG_MINE, R.string.category_mine,
				R.drawable.icon_4_n, mMineIntent));
		mTabHost.addTab(buildTabSpec(TAB_TAB_SETTING,
				R.string.category_setting, R.drawable.icon_5_n, mSettingIntent));
	}

	private TabHost.TabSpec buildTabSpec(String tag, int resLabel, int resIcon,
			final Intent content) {
		return mTabHost
				.newTabSpec(tag)
				.setIndicator(getString(resLabel),
						getResources().getDrawable(resIcon))
				.setContent(content);
	}
}
