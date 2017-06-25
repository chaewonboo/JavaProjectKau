package com.example.chaewonboo.kaunovel;

import android.graphics.drawable.Drawable;

import java.util.HashMap;

/**
 * Created by chaewonboo on 2017. 6. 12..
 */

//씬 데이타를 설정 넘겨주는 함수.
public class SceneData {
    HashMap<String, Scene> map = new HashMap<>();

    //이것이 화면에 보여주게 리턴해주는 함수다
    public Scene GetScene(String id) {
        return map.get(id);
    }

    //이것이 해쉬맵 키와 내용을 불러오는 함수다
    public void CreateScene(String id, Scene scene){
        map.put(id, scene);
    }
}
