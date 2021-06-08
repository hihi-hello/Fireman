/*작성자 : 김영현
  내용 :  아케이드 관련 정보들 저장 */

package com.example.fireoperationmap;

public class Arcade {
    private String detail;
    private String id;
    private String num;
    private float x;
    private float y;

    public String getDetail() {
        return detail;
    }
    public String getId() {
        return id;
    }
    public int getNum() {
        return Integer.parseInt(this.num);
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public Arcade(){}
}
