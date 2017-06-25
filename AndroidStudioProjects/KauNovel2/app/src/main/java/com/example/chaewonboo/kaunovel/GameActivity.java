package com.example.chaewonboo.kaunovel;

import android.media.AudioManager;
import android.media.MediaRecorder;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import android.media.AudioManager;
import android.media.SoundPool;


public class GameActivity extends AppCompatActivity {
    int num=0;
    //변수로 만들어줌 버튼 아이디를
    @BindView(R.id.choice_button) Button choiceButton;
    @BindView(R.id.select_button1) Button selectButton1;
    @BindView(R.id.select_button2) Button selectButton2;
    @BindView(R.id.select_button3) Button selectButton3;


    //번튼 숨기기 함수
    private void hide(){
        selectButton1.setVisibility(View.GONE);
        selectButton2.setVisibility(View.GONE);
        selectButton3.setVisibility(View.GONE);
        if(num==1){
            choiceButton.setVisibility(View.GONE);
        }
        else if(num==0){
            choiceButton.setVisibility(View.VISIBLE);
        }
    }
    //버튼
    private void show(){
        selectButton1.setVisibility(View.VISIBLE);
        selectButton2.setVisibility(View.VISIBLE);
        selectButton3.setVisibility(View.VISIBLE);
    }

    int debug=0;
    @OnClick(R.id.select_button1)
    public void selectButtonClicked1() {
        if(debug==0){
            currentScene="#8-1";
        }
        if (currentScene.equals("#8-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#8-1").text);
        }
        if(debug==1){
            currentScene="#3-1";
        }
        if (currentScene.equals("#3-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#3-1").text);
        }
        debug+=1;
    }

    @OnClick(R.id.select_button2)
    public void setSelectButtonClicked2(){
        if(debug==0){
            currentScene="#9-1";
        }
        if (currentScene.equals("#9-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#9-1").text);
        }
        if(debug==1){
            currentScene="#6-1";
        }
        if (currentScene.equals("#6-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#6-1").text);
        }
        debug+=1;
    }

    @OnClick(R.id.select_button3)
    public void setSelectButtonClicked3(){
        if(debug==0){
            currentScene="#10-1";
        }
        if (currentScene.equals("#10-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#10-1").text);
        }
        if(debug==1){
            currentScene="#5-1";
        }
        if (currentScene.equals("#5-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#5-1").text);
        }
        debug+=1;
    }

    @OnClick(R.id.choice_button)
    public void choiceButtonClicked() {


        if (currentScene.equals("#0")) {
            currentScene = "#1";
        }
        else if (currentScene.equals("#1")) {
            currentScene = "#2";
        }
        else if (currentScene.equals("#2")) {
            currentScene = "#3";
        }
        else if (currentScene.equals("#3")) {
            currentScene = "#4";
        }
        else if (currentScene.equals("#4")) {
            currentScene = "#4-1";
        }
        else if (currentScene.equals("#4-1")) {
            currentScene = "#4-2";
        }
        else if (currentScene.equals("#4-2")) {
            currentScene = "#4-3";
        }
        else if (currentScene.equals("#4-3")) {
            currentScene = "#4-4";
        }
        else if (currentScene.equals("#4-4")) {
            currentScene = "#4-5";
        }
        else if (currentScene.equals("#4-5")) {
            currentScene = "#4-6";
        }
        else if (currentScene.equals("#4-6")) {
            currentScene = "#5";
        }
        else if (currentScene.equals("#5")) {
            currentScene = "#6";
        }
        else if (currentScene.equals("#6")) {
            currentScene = "#7";
        }
        else if (currentScene.equals("#7")){
            show();
            selectButton1.setText(sceneData.GetScene("#7-1").text);
            selectButton2.setText(sceneData.GetScene("#7-2").text);
            selectButton3.setText(sceneData.GetScene("#7-3").text);
        }
        else if(currentScene.equals("#8-1")){
            choiceButton.setText(sceneData.GetScene("#8-1").text);
            currentScene="#8-2";
        }

        else if (currentScene.equals("#8-2")){
            choiceButton.setText(sceneData.GetScene("#8-2").text);
            currentScene = "#8-3";
        }

        else if (currentScene.equals("#8-3")){
            choiceButton.setText(sceneData.GetScene("#8-3").text);
            currentScene = "#8-4";
        }

        else if (currentScene.equals("#8-4")){
            choiceButton.setText(sceneData.GetScene("#8-4").text);
            currentScene = "#8-5";
        }

        else if (currentScene.equals("#8-5")){
            choiceButton.setText(sceneData.GetScene("#8-5").text);
        }
        //-----------------
        else if (currentScene.equals("#9-1")){
            choiceButton.setText(sceneData.GetScene("#9-1").text);
            currentScene = "#9-2";
        }
        else if (currentScene.equals("#9-2")){
            choiceButton.setText(sceneData.GetScene("#9-2").text);
            currentScene = "#9-3";
        }
        else if (currentScene.equals("#9-3")){
            choiceButton.setText(sceneData.GetScene("#9-3").text);
            currentScene = "#9-4";
        }
        else if (currentScene.equals("#9-4")){
            choiceButton.setText(sceneData.GetScene("#9-4").text);
            currentScene = "#9-5";
        }
        else if (currentScene.equals("#9-5")){
            choiceButton.setText(sceneData.GetScene("#9-5").text);
            currentScene = "#9-6";
        }
        else if (currentScene.equals("#9-6")){
            choiceButton.setText(sceneData.GetScene("#9-6").text);
            currentScene = "#9-7";
        }
        else if (currentScene.equals("#9-7")){
            choiceButton.setText(sceneData.GetScene("#9-7").text);
            currentScene = "#9-8";
        }
        else if (currentScene.equals("#9-8")){
            choiceButton.setText(sceneData.GetScene("#9-8").text);
            currentScene = "#9-9";
        }
        else if (currentScene.equals("#9-9")){
            choiceButton.setText(sceneData.GetScene("#9-9").text);
            currentScene = "#9-10";
        }
        //-------------------
        //새로운 3개 선택지 //  ------------------



        else if (currentScene.equals("#10-1")){
            choiceButton.setText(sceneData.GetScene("#10-1").text);
            currentScene = "#10-2";
        }
        else if (currentScene.equals("#10-2")){
            choiceButton.setText(sceneData.GetScene("#10-2").text);
            currentScene = "#10-3";
        }
        else if (currentScene.equals("#10-3")){
            choiceButton.setText(sceneData.GetScene("#10-3").text);
            currentScene = "#10-4";
        }
        else if (currentScene.equals("#10-4")){
            choiceButton.setText(sceneData.GetScene("#10-4").text);
            currentScene = "#10-5";
        }
        else if (currentScene.equals("#10-5")){
            choiceButton.setText(sceneData.GetScene("#10-5").text);
            currentScene = "#10-6";
        }
        else if (currentScene.equals("#10-6")){
            choiceButton.setText(sceneData.GetScene("#10-6").text);
            currentScene = "#10-7";
        }
        else if (currentScene.equals("#10-7")){
            choiceButton.setText(sceneData.GetScene("#10-7").text);
            currentScene = "#10-8";
        }
        else if (currentScene.equals("#10-8")){
            choiceButton.setText(sceneData.GetScene("#10-8").text);
            currentScene = "#10-9";
        }
        else if (currentScene.equals("#10-9")){
            choiceButton.setText(sceneData.GetScene("#10-9").text);
            currentScene = "#10-10";
        }
        else if (currentScene.equals("#10-10")){
            choiceButton.setText(sceneData.GetScene("#10-10").text);
        }

        else if (currentScene.equals("#9-10")){
            show();
            selectButton1.setText(sceneData.GetScene("#2-1").text);
            selectButton2.setText(sceneData.GetScene("#2-2").text);
            selectButton3.setText(sceneData.GetScene("#2-3").text);
        }

        else if (currentScene.equals("#3-1")){
            choiceButton.setText(sceneData.GetScene("#3-1").text);
            currentScene = "#3-2";
        }
        else if (currentScene.equals("#3-2")){
            choiceButton.setText(sceneData.GetScene("#3-2").text);
            currentScene = "#3-3";
        }
        else if (currentScene.equals("#3-3")){
            choiceButton.setText(sceneData.GetScene("#3-3").text);
            currentScene = "#3-4";
        }
        else if (currentScene.equals("#3-4")){
            choiceButton.setText(sceneData.GetScene("#3-4").text);
            currentScene = "#3-5";
        }
        else if (currentScene.equals("#3-5")){
            choiceButton.setText(sceneData.GetScene("#3-5").text);
            currentScene = "#0-0";
        }
        //포인터 양과의 대화!!!!!
        //----------------------------------------
        //3-5와 0-0이 연결임!!!!---------------------

        else if (currentScene.equals("#0-0")){
            choiceButton.setText(sceneData.GetScene("#0-0").text);
            currentScene = "#0-1";
        }
        else if (currentScene.equals("#0-1")){
            choiceButton.setText(sceneData.GetScene("#0-1").text);
            currentScene = "#0-1-1";
        }
        else if (currentScene.equals("#0-1-1")){
            choiceButton.setText(sceneData.GetScene("#0-1-1").text);
            currentScene = "#0-2";
        }
        else if (currentScene.equals("#0-2")){
            choiceButton.setText(sceneData.GetScene("#0-2").text);
            currentScene = "#0-3";
        }
        else if (currentScene.equals("#0-3")){
            choiceButton.setText(sceneData.GetScene("#0-3").text);
            currentScene = "#0-4";
        }
        else if (currentScene.equals("#0-4")){
            choiceButton.setText(sceneData.GetScene("#0-4").text);
            currentScene = "#0-5";
        }
        else if (currentScene.equals("#0-5")){
            choiceButton.setText(sceneData.GetScene("#0-5").text);
            currentScene = "#0-6";
        }
        else if (currentScene.equals("#0-6")){
            choiceButton.setText(sceneData.GetScene("#0-6").text);
            currentScene = "#0-7";
        }
        else if (currentScene.equals("#0-7")){
            choiceButton.setText(sceneData.GetScene("#0-7").text);
            currentScene = "#0-8";
        }
        else if (currentScene.equals("#0-8")){
            choiceButton.setText(sceneData.GetScene("#0-8").text);
            currentScene = "#0-9";
        }
        else if (currentScene.equals("#0-9")){
            choiceButton.setText(sceneData.GetScene("#0-9").text);
        }

        //2번째 선택지에서 3번선택
        else if (currentScene.equals("#5-1")){
            choiceButton.setText(sceneData.GetScene("#5-1").text);
            currentScene = "#5-2";
        }
        else if (currentScene.equals("#5-2")){
            choiceButton.setText(sceneData.GetScene("#5-2").text);
            currentScene = "#5-3";
        }
        else if (currentScene.equals("#5-3")){
            choiceButton.setText(sceneData.GetScene("#5-3").text);
            currentScene = "#5-4";
        }
        else if (currentScene.equals("#5-4")){
            choiceButton.setText(sceneData.GetScene("#5-4").text);
            currentScene = "#5-5";
        }
        else if (currentScene.equals("#5-5")){
            choiceButton.setText(sceneData.GetScene("#5-5").text);
            currentScene = "#5-6";
        }
        else if (currentScene.equals("#5-6")){
            choiceButton.setText(sceneData.GetScene("#5-6").text);
            currentScene = "#5-7";
        }
        else if (currentScene.equals("#5-7")){
            choiceButton.setText(sceneData.GetScene("#5-7").text);
            currentScene = "#5-8";
        }
        else if (currentScene.equals("#5-8")){
            choiceButton.setText(sceneData.GetScene("#5-8").text);
            currentScene = "#5-9";
        }
        else if (currentScene.equals("#5-9")){
            choiceButton.setText(sceneData.GetScene("#5-9").text);
        }

        else if (currentScene.equals("#6-1")){
            choiceButton.setText(sceneData.GetScene("#6-1").text);
            currentScene = "#6-2";
        }
        else if (currentScene.equals("#6-2")){
            choiceButton.setText(sceneData.GetScene("#6-2").text);
            currentScene = "#6-3";
        }
        else if (currentScene.equals("#6-3")){
            choiceButton.setText(sceneData.GetScene("#6-3").text);
            currentScene = "#6-4";
        }
        else if (currentScene.equals("#6-4")){
            choiceButton.setText(sceneData.GetScene("#6-4").text);
            currentScene = "#6-5";
        }
        else if (currentScene.equals("#6-5")){
            choiceButton.setText(sceneData.GetScene("#6-5").text);
            currentScene = "#6-6";
        }
        else if (currentScene.equals("#6-6")){
            choiceButton.setText(sceneData.GetScene("#6-6").text);
            currentScene = "#6-7";
        }
        else if (currentScene.equals("#6-7")){
            choiceButton.setText(sceneData.GetScene("#6-7").text);
            currentScene = "#6-8";
        }
        else if (currentScene.equals("#6-8")){
            choiceButton.setText(sceneData.GetScene("#6-8").text);
            currentScene = "#6-9";
        }
        else if (currentScene.equals("#6-9")){
            choiceButton.setText(sceneData.GetScene("#6-9").text);
            currentScene = "#6-10";
        }
        else if (currentScene.equals("#6-10")){
            choiceButton.setText(sceneData.GetScene("#6-10").text);
            currentScene = "#6-11";
        }
        else if (currentScene.equals("#6-11")){
            choiceButton.setText(sceneData.GetScene("#6-11").text);
            currentScene = "#6-12";
        }
        else if (currentScene.equals("#6-12")){
            choiceButton.setText(sceneData.GetScene("#6-12").text);
            currentScene = "#6-13";
        }
        else if (currentScene.equals("#6-13")){
            choiceButton.setText(sceneData.GetScene("#6-13").text);
            currentScene = "#6-14";
        }
        else if (currentScene.equals("#6-14")){
            choiceButton.setText(sceneData.GetScene("#6-14").text);
            currentScene = "#6-15";
        }
        else if (currentScene.equals("#6-15")){
            choiceButton.setText(sceneData.GetScene("#6-15").text);
            currentScene = "#6-16";
        }
        else if (currentScene.equals("#6-16")){
            choiceButton.setText(sceneData.GetScene("#6-16").text);
            currentScene = "#a-1";
        }

        //신입생 프라이베잇과 대화----------------------------
        //6-16에서 ㄱ-1로 이어짐----------------------------
        else if (currentScene.equals("#a-1")){
            choiceButton.setText(sceneData.GetScene("#a-1").text);
            currentScene = "#a-2";
        }
        else if (currentScene.equals("#a-2")){
            choiceButton.setText(sceneData.GetScene("#a-2").text);
            currentScene = "#a-3";
        }
        else if (currentScene.equals("#a-3")){
            choiceButton.setText(sceneData.GetScene("#a-3").text);
            currentScene = "#a-4";
        }
        else if (currentScene.equals("#a-4")){
            choiceButton.setText(sceneData.GetScene("#a-4").text);
            currentScene = "#a-5";
        }
        else if (currentScene.equals("#a-5")){
            choiceButton.setText(sceneData.GetScene("#a-5").text);
            currentScene = "#a-6";
        }
        else if (currentScene.equals("#a-6")){
            choiceButton.setText(sceneData.GetScene("#a-6").text);
            currentScene = "#a-7";
        }
        else if (currentScene.equals("#a-7")){
            choiceButton.setText(sceneData.GetScene("#a-7").text);
            currentScene = "#a-8";
        }
        else if (currentScene.equals("#a-8")){
            choiceButton.setText(sceneData.GetScene("#a-8").text);
            currentScene = "#a-9";
        }
        else if (currentScene.equals("#a-9")){
            choiceButton.setText(sceneData.GetScene("#a-9").text);
            currentScene = "#a-10";
        }
        else if (currentScene.equals("#a-10")){
            choiceButton.setText(sceneData.GetScene("#a-10").text);
            currentScene = "#a-11";
        }
        else if (currentScene.equals("#a-11")){
            choiceButton.setText(sceneData.GetScene("#a-11").text);
            currentScene = "#a-12";
        }
        else if (currentScene.equals("#a-12")){
            choiceButton.setText(sceneData.GetScene("#a-12").text);
            currentScene = "#a-13";
        }
        else if (currentScene.equals("#a-13")){
            choiceButton.setText(sceneData.GetScene("#a-13").text);
        }

        Scene scene = sceneData.GetScene(currentScene);
        choiceButton.setText(scene.text);
        getWindow().getDecorView().setBackground(scene.background);
    }

    SceneData sceneData = new SceneData();

    String currentScene;
    //select button1 진행 변수
    String currentScene1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ButterKnife.bind(this);
        hide();
        buildStory();

        currentScene = "#0";
    }
    //3번째꺼가 바꿔
    private void buildStory() {
        sceneData.CreateScene("#1", new Scene("수상한 고양이 : 야옹 (야 ! 야 !)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#2", new Scene("나: 이게 무슨소리지??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#3", new Scene("수상한 고양이: 야야양야ㅑ야양아아아아아아앙ㅇㅇ (너 내말이 들리니?)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#4", new Scene("나: 뭐야 이 고양이! 말을 하잖아!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        //
        sceneData.CreateScene("#4-1", new Scene("수상한 고양이 : 후후 내말이 들리는걸 보니 당신 진성 공대생 이로군",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#4-2", new Scene("수상한 고양이 : 보아하니 여자인 친구도 한명도 없겠군",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#4-3", new Scene("나: 무슨소리야!! (당황당황)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#4-4", new Scene("수상한 고양이 : 당신이 내 고민을 해결해 준다면 공대 인기남으로 만들어 줄수도 있는데 후후",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#4-5", new Scene("나: 어.? 고민이 뭔데???(솔깃)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#4-6", new Scene("수상한 고양이 : 고민을 말하기 전에 먹은게 없어서 힘이 없군..",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        //
        sceneData.CreateScene("#5", new Scene("수상한 고양이: 닝겐 혹시 먹을것이 있는가? ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#6", new Scene("수상한 고양이: 짐이 배가 고파서 말이지..",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#7", new Scene("나: 뭐가 있으려나 (주섬주섬)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        num+=1;
        //음식 선택 하는걸 만들고 싶다 본격적 질문지
        sceneData.CreateScene("#7-1", new Scene("청산가리",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#7-2", new Scene("양성자, 중성자 패밀리팩",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#7-3", new Scene("평범한 참치캔",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        // 7-1 선택시  실행
        sceneData.CreateScene("#8-1", new Scene("나: 자! 푸른빛이 도는 싱싱한 청산가리야!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#8-2", new Scene("수상한 고양이 : 끼에에에에야야야야냐냐냐냐냥 !!!!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#8-3", new Scene("나: 어 어어!! 왜그래 냥이야! (당황하면서)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#8-3", new Scene("수상한 고양이 : 너도 다른사람들이랑 똑같냥!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#8-4", new Scene("수상한 고양이 : 넌 나에게 말을걸 자격이 없당!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#8-5", new Scene("GAME OVER.....!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        // 7-2 선택시 실행
        sceneData.CreateScene("#9-1", new Scene("나: 요즘 공대 신상 햄버거 쿼크버거야!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-2", new Scene("수상한 고양이 : 오호라 흥미러운 음식을 주는 닝.겐.이.군.! 후후..!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-3", new Scene("수상한 고양이 : 이정도의 음식 센스를 가진 사람이라면 내 고민을 들어줄수 있겠군.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        //
        sceneData.CreateScene("#9-4", new Scene("나: 그래서 너의 정체가 뭐야!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-5", new Scene("수상한 고양이 : 후후 자기소개의 시간인가.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-6", new Scene("수상한 고양이 : 이몸으로 말하자면 나는 공대의 귀염둥이!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-7", new Scene("수상한 고양이 : 공대의 수호신!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-8", new Scene("슈뢰딩거의 고양이 : 슈뢰딩거의 고양이댱!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-9", new Scene("나 : 역시 이런 이상한 공대따위 오는게 아니였어..",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-10", new Scene("나 : 어어..?(이런 수업이 늦겠잖어 어쩌지;;;)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        //선택지

        //스토리 선택지 새롭게


        // 7-3 선택시 실행
        sceneData.CreateScene("#10-1", new Scene("나: 자 여기~(크크 고양이들 이라면 환장하는 참치캔을 주지)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-2", new Scene("수상한 고양이 : 오호 무슨 음식이냥~",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-3", new Scene("나 : (크크크크 아주 좋아죽을꺼야 쿸쿸쿸)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-4", new Scene("수상한 고양이 : 뭐야 이거 참치캔이잖아!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-5", new Scene("나 : 호호 맘에 들지~?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-6", new Scene("수상한 고양이 : 어디 이런 저급한 음식을 들이대는거냥!!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-7", new Scene("나 : 응..? (뭐야 이게 아닌데!)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-8", new Scene("수상한 고양이 : 이몸이 누군지 알고!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-9", new Scene("수상한 고양이 : 썩 꺼지거냥!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-10", new Scene("GAME OVER....",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        //두번째 선택지..
        sceneData.CreateScene("#2-1", new Scene("1. 수업에 늦어서 수업을 간다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#2-2", new Scene("2. 고양이의 말을 계속 듣는다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#2-3", new Scene("3. 고양이가 쉬도록 박스를 덮어준다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#3-1", new Scene("나: 어어..? 난 수업이 늦어서 가봐야 할꺼같어!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#3-2", new Scene("슈뢰딩거의 고양이 : 어리석은 닝겐이여...",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#3-3", new Scene("슈뢰딩거의 고양이 : 나의 가호를 버리는구나...",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#3-4", new Scene("나: 이상한 고양이 때문에 수업에 늦었잖어 ㅡ.ㅡ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#3-5", new Scene("다다다다다 (교실로 뛰어 간다.)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        //
        sceneData.CreateScene("#5-1", new Scene("나: (고양이들이 그러헥 박스를 좋아한다지!)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-2", new Scene("슈뢰딩거의 고양이 : 잠깐 잠깐! 닝겐 무엇을 하는것이냐!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-3", new Scene("나: 고양이야 자외선이 강하니 박스로 그늘을 피하렴 ^^",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-4", new Scene("슈뢰딩거의 고양이 : 아아아 앙댄다냥!!!!!!!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-5", new Scene("슈뢰딩거의 고양이 : 끼냥!!! (고양이가 박스로 들어갔다)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-6", new Scene("슈뢰딩거의 방정식이 발동했다!!!. ",
               ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-7", new Scene("고양이가 50% 확률로 죽을지도 모른다. ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-8", new Scene("공대의 수호신을 죽인거같다...",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-9", new Scene("GAME OVER......",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        //스토리 진행을 위한 선택시

        sceneData.CreateScene("#6-1", new Scene("나: 그래 고민이 뭐묘? (오늘 수업은 무시하자!)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-2", new Scene("슈뢰딩거의 고양이 : 난 박스를 정말 싫어해!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-3", new Scene("나: 고양이들은 박스를 다 좋아하지 않어??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-4", new Scene("슈뢰딩거의 고양이 : 아니다냥! 난 슈뢰딩거의 공양이라 박스를 덮으면 죽을지도 모른다냥!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-5", new Scene("나: (헉! 아까 잘못했으면 박스를 덮을뻔했는데!!!)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-6", new Scene("나: 휴...(다행이다)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-7", new Scene("나: 그러면 앞으로 내가 박스로 부터 널 지켜줄께!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-8", new Scene("슈뢰딩거의 고양이 : 참으로 착한 공대생이군",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-9", new Scene("슈뢰딩거의 고양이 : 내이야기도 들을수 있고 너에게 축복을 주마!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-10", new Scene("(슈뢰딩거 고양이의 축복을 받았다.)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-11", new Scene("슈뢰딩거의 고양이 : 공대의 힘이 함께하길...",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-12", new Scene("나: 뭐야! 고양이가 어디갔지??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-13", new Scene("(카톡왔졍 카톡왔쪙!)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#6-14", new Scene("나 : 어 나한테 카톡이 오다니 무슨일이지....?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#6-15", new Scene("17신입생 : 오빠 뭐해용~~~??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.kakao),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.kakao)));
        sceneData.CreateScene("#6-16", new Scene("TO BE COUNTINUE...",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.kakao),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.kakao)));


        //신입생 이야기 가 이어진다. 신입생 스토리는 "#ㄱ-1" 부터 시작한다.
        //---------------------------------------------------------
        sceneData.CreateScene("#a-1", new Scene("휴 시작부터 힘든 하루야...(터벅터벅)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.bok),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.bok)));
        sceneData.CreateScene("#a-2", new Scene("(털썩) 앉아서 코딩이나 해야지ㅜㅜ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#a-3", new Scene("툭툭 (누군가 어깨를 톡톡 친다.)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#a-4", new Scene("17 신입생 : 오빠!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-5", new Scene("나 : 어..어 누구였지 ?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-6", new Scene("17 신입생 : 흥! 저 기억 안나요??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-7", new Scene("17 신입생 : 저번에 같이 술마셨잖아요!, 고양이도 보고!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-8", new Scene("나 : (뭐지 기억안나는데 슈뢰딩거 고양이인가??) ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-9", new Scene("나 : 어 어 그래 안녕!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-10", new Scene("17 신입생 : 약속 기억하시죠? 커피사줘요!!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-11", new Scene("나 : 아..아니 내가 그랬나,,,?? (와 이쁘다!)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-12", new Scene("나 : 그건 그렇고 넌 이름이 뭐니?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-13", new Scene("17 신입생 : 뭐게용~",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));


        //3-5 슈레딩거 고양이 1번선택지 축복없을 경우 선택시
        sceneData.CreateScene("#0-0", new Scene("축복을 받지 못해 신입생에게 말걸 용기가 사라졌다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#0-1", new Scene("고양이 학점 : b0",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#0-1-1", new Scene("교실 문을 열었다 (드르륵)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#0-2", new Scene("김교수님 : 자 자바에서 메모리 구조는!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.chul),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.chul)));
        sceneData.CreateScene("#0-3", new Scene("김교수님 : 공대생학생 지각입니다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.chul),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.chul)));
        sceneData.CreateScene("#0-4", new Scene("나 : 죄송합니다 교수님 ㅜㅜ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.chul),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.chul)));
        sceneData.CreateScene("#0-5", new Scene("??? : 너 또 지각이구나 ㅎㅎ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#0-6", new Scene("나 : 어... 너는??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#0-7", new Scene("(이녀석은 나의 동기 포인터양 이다.)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#0-8", new Scene("(누구한테나 밝게 인사를 해주는 착한친구)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#0-9", new Scene("(나같은 아싸한테도 말을 걸어주는구나..)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));

        //------------------포인터양 동기 계속 만들기!------------
        //--------------------------------------------------


    }
}
