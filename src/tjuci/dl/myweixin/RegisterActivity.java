package tjuci.dl.myweixin;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;
/**
 * ����  �ǶԲ���main.xml�� �ؼ��Ĳ���
 * @author dl
 *
 */
public class RegisterActivity extends Activity implements OnClickListener{
	Button rebackBtn,registbu;
	EditText userEdit,passwdEdit,passwdEdit2;
	PopupWindow popup ;
	RelativeLayout loginLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.register);
        rebackBtn = (Button)findViewById(R.id.regist_reback_bu);
        rebackBtn.setOnClickListener(this);//ע�������  һ��������
       registbu = (Button)findViewById(R.id.regist_bu);
        registbu.setOnClickListener(this);//ע�������  һ��������
        passwdEdit = (EditText)findViewById(R.id.regist_edit2);
        userEdit = (EditText)findViewById(R.id.regist_edit1);
        passwdEdit2=(EditText)findViewById(R.id.regist_edit3);
    }
	@Override
	public void onClick(View v) {
		int viewId=v.getId();
		switch(viewId){
		case R.id.regist_reback_bu:
			RegisterActivity.this.finish();
			break;
		case R.id.regist_bu:
		String userStr=userEdit.getText().toString().trim();
		String passwdStr1=passwdEdit.getText().toString().trim();
		String passwdStr2=passwdEdit2.getText().toString().trim();
		if((userStr.equals(""))||(passwdStr1.equals(""))||(passwdStr2.equals("")))
		{
				new AlertDialog.Builder(RegisterActivity.this)
				.setIcon(getResources().getDrawable(R.drawable.login_error_icon))
				.setTitle("��¼ʧ��")
				
				.setMessage("΢���˺Ż����벻��Ϊ�գ�������΢���˺Ż�����")
				.create().show();
				}else{
					Toast toast=Toast.makeText(RegisterActivity.this,"ע��ɹ�",Toast.LENGTH_SHORT);
					toast.show();
				}
				
		break;
		}
		}
	
}