package com.example.chaewonboo.kaunovel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.start_button)
    public void startButtonClicked() {
        Intent intent = new Intent(MainActivity.this, GameActivity.class);
        startActivity(intent);
    }

//    Button startButton;

    @Override
    //oncreat 는 main문 비슷
    protected void onCreate(Bundle savedInstanceState) {
        //초기화
        super.onCreate(savedInstanceState);
        //이 xml 파일을 여기에 할당해라
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        //뷰를 상속받아 만든게 버튼 이걸 버튼으로 만들어줌 = 캐스팅
/*        startButton = (Button) findViewById(R.id.start_button);
        //셋온클릭리스너 버튼을 눌렀을때 실행될 구문을 만들어라. 만든게 뷰점 온클릭리스너
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });*/

    }
}
