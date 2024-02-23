package com.taeyoun.resource.map;

public class Map {
	private static final int WIDTH = 100;	// 맵의 가로 길이는 100 으로 고정
	private static final int HEIGHT = 100;	// 맵의 세로 길이는 100 으로 고정
	private Cell[][]grid;					// 2차원 Cell type 배열 grid 생성
	
	
    public Map() {							// Map의 생성자 , 파라미터가 없음
    	initializeMap();
    }
	
    private void initializeMap() {				//map 에 좌표 번호 지정하기
        this.grid = new Cell[WIDTH][HEIGHT];
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                this.grid[x][y] = new Cell(x, y);
            }
        }
    }
}
