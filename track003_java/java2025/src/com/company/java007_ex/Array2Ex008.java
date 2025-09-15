package com.company.java007_ex;

public class Array2Ex008 {
	public static void main(String[] args) {
		// 변수
		int[][] datas = {  {  10, 10, 10 ,10}, 
	            {  20, 20, 20 ,20}, 
	            {  30, 30, 30 ,30},  };
		int [][] result = new int [datas.length+1][datas[0].length+1];
		// 입력 result[0][0] = datas[0][0]
		for(int ch=0; ch<datas.length; ch++) {
			for(int kan=0; kan<datas[0].length; kan++) {
				result[ch][kan] = datas[ch][kan];
			}
		}
		// 처리(1) 가로 
//		result[0][4] += result[0][0];
//		result[0][4] += result[0][1];
//		result[0][4] += result[0][2];
//		result[0][4] += result[0][3];
//		
//		result[1][4] += result[1][0];
//		result[1][4] += result[1][1];
//		result[1][4] += result[1][2];
//		result[1][4] += result[1][3];
//		
//		result[2][4] += result[2][0];
//		result[2][4] += result[2][1];
//		result[2][4] += result[2][2];
//		result[2][4] += result[2][3];
//		
//		for(int kan=0; kan<result[0].length-1; kan++) {result[0][4]+=result[0][kan];}
//		for(int kan=0; kan<result[0].length-1; kan++) {result[1][4]+=result[0][kan];}
//		for(int kan=0; kan<result[0].length-1; kan++) {result[2][4]+=result[0][kan];}
//		for (int ch = 0; ch < result.length - 1; ch++) {
//			for (int kan = 0; kan < result[0].length - 1; kan++) {
//				result[ch][4] += result[ch][kan];
//			}
//		}
		// 처리(2) 세로
//		result[3][0] += result[0][0];
//		result[3][1] += result[0][1];
//		result[3][2] += result[0][2];
//		result[3][3] += result[0][3];
//		
//		result[3][0] += result[1][0];
//		result[3][1] += result[1][1];
//		result[3][2] += result[1][2];
//		result[3][3] += result[1][3];
//		
//		result[3][0] += result[2][0];
//		result[3][1] += result[2][1];
//		result[3][2] += result[2][2];
//		result[3][3] += result[2][3];
		
//		for(int ch=0; ch<result[0].length-1; ch++){result[3][0]+=result[ch][0];}
//		for(int ch=0; ch<result[0].length-1; ch++){result[3][1]+=result[ch][0];}
//		for(int ch=0; ch<result[0].length-1; ch++){result[3][2]+=result[ch][0];}
//      for(int ch=0; ch<result[0].length-1; ch++){result[3][3]+=result[ch][0];}
//		for (int ch = 0; ch < result[0].length - 1; ch++) {
//			for (int kan = 0; kan < result[0].length - 1; kan++) {
//				result[3][kan] += result[ch][0];
//			}
//		}
//			
		// 처리(3) 전체
		for(int ch=0; ch<result.length-1; ch++) {
			for(int kan=0; kan<result[0].length-1; kan++) {
				result[ch][4] += result[ch][kan];
				result[3][kan] += result[ch][0];
				result[3][4] += result[ch][kan];
			}
		}
		
		// 출력
		for(int ch=0; ch<result.length; ch++) {
			for(int kan=0; kan<result[ch].length; kan++) {
				System.out.print(result[ch][kan] +"\t");
			} System.out.println();
		}
	}

}
