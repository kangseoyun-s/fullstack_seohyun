package com.company.java008_ex;

import java.util.Arrays;

public class MethodEx008_2 {
	public static void lend(String [] toybox) {toybox[0]= "X";}
	public static void main(String[] args) {
		String [] toybox = {"레고", "주방놀이세트", "낚시 장난감", "우주선", "공룡"};
		System.out.println("처음 toybox > " + Arrays.toString(toybox));
		lend(toybox); 
		System.out.println("친구가 빌려간 후 toybox > " + Arrays.toString(toybox));
		}

}
/*[method area] 1) MethodEx008_2 정보
  [heap area]          [stack area]
                      < lend[1000번지]
  3)1000번지            < toybox[1000번지] 8번째
  {"레고", "주방놀이세트",,,}
                       2) main
  *
  */
 