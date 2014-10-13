package tjuci.dl.myweixin;

import android.app.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
/**
 * ����  �ǶԲ���main.xml�� �ؼ��Ĳ���
 * @author dl
 *
 */
public class MyWeiXinActivity extends Activity implements OnClickListener{
	Button loginBtn,registBtn;
	final int item1=0x111,item2=0x112,item3=0x113;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        loginBtn = (Button)findViewById(R.id.main_login_btn);
        registBtn = (Button)findViewById(R.id.main_regist_btn);
        loginBtn.setOnClickListener(this);
        registBtn.setOnClickListener(this);
    }
	@Override
	public void onClick(View v) {
		int btnId = v.getId();
		switch (btnId) {//�жϵ���İ�ť
		case R.id.main_login_btn://��¼��ť
			Intent intent = new Intent(MyWeiXinActivity.this, LoginActivity.class);
			startActivity(intent);//������Ӧ��Activity  �˴�ΪӲ����  ��������ôд  д��action��ʽ ���
			Log.i("-------------", "------------------");
			break;

		case R.id.main_regist_btn://ע�ᰴť
			Intent in=new Intent(MyWeiXinActivity.this, RegisterActivity.class);
			startActivity(in);
			break;
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		menu.add(0,item1,0,"����");
		menu.add(0,item2,0,"�л��˺�");
		menu.add(0,item3,0,"�˳�");
		return super.onCreateOptionsMenu(menu);
	}
	
	public boolean onOptionsMenuSelected(MenuItem item){
		switch(item.getItemId()){
		case item1:
			Intent in1=new Intent(MyWeiXinActivity.this,MenuActivity1.class);
			startActivity(in1);
			break;
		case item2:
			Intent in2=new Intent(MyWeiXinActivity.this,MenuActivity2.class);
			startActivity(in2);
			break;
		case item3:
			this.finish();
		}
		return true;
	}
	@Override  
	//�������ΰ����˳�
	public void onBackPressed()
	{  Toast toast=Toast.makeText(MyWeiXinActivity.this,"�ٰ�һ���˳�",Toast.LENGTH_SHORT);
	    this.finish();
	}  
}