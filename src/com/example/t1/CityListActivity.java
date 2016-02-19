package com.example.t1;

import org.json.JSONObject;

import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.t1.view.ICityListView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class CityListActivity extends Activity implements ICityListView {

	private String APP_KEY = "a7af51284ba0431e8a71a225cd5d1dfd";

	private int CITY_TAG = R.id.id_city;
	private ListView lv_city;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		// TODO Auto-generated method stub
		lv_city = (ListView) findViewById(R.id.lv_city);
		RequestQueue mQueue = Volley.newRequestQueue(this);
		JsonObjectRequest sr = new JsonObjectRequest(Method.GET, "https://api.heweather.com/x3/citylist?search=hotworld&key=a7af51284ba0431e8a71a225cd5d1dfd", new Listener<JSONObject>() {

			@Override
			public void onResponse(JSONObject arg0) {
				// TODO Auto-generated method stub
				System.out.println(arg0.toString());
			}
		}, new Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError arg0) {
				// TODO Auto-generated method stub
				System.out.println(arg0.toString());
			}
		});
		mQueue.add(sr);

		// RequestParams params = new RequestParams();
		// params.put("search", "allchina"); //search 城市列表类型 国内城市：allchina、
		// 热门城市：hotworld、 全部城市：allworld
		// params.put("key", "a7af51284ba0431e8a71a225cd5d1dfd");
		// client.getRequest(CITY_TAG, "https://api.heweather.com/x3/citylist",
		// params, this);
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showProgress() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hideProgress() {
		// TODO Auto-generated method stub

	}
}
