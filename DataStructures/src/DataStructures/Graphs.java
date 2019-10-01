package DataStructures;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Graphs {
	
	public static void dfsHelper(int[][] edges, int sv, boolean[] visited) {
		
		System.out.println(sv);
		visited[sv]=true;
		for(int i=0;i<edges.length;i++) {
			if(edges[sv][i]==1 && visited[i]==false) {
				dfsHelper(edges, i, visited);
			}
		}
	}
	
	public static void dfs(int[][] edges) {
		
		int n = edges.length;
		boolean[] visited = new boolean[n];
		for(int i=0;i<edges.length;i++) {
			if(visited[i]==false) {
				dfsHelper(edges, i, visited);
			}
		}
	}
	
	public static void bfsHelper(int[][] edges, int sv, boolean[] visited) {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(sv);
		visited[sv]=true;
		while(!q.isEmpty()) {
			int v = q.poll();
			System.out.println(v);
			for(int i=0;i<edges.length;i++) {
				if(edges[v][i]==1 && visited[i]==false) {
					q.add(i);
					visited[i]=true;
				}
			}
		}
	}
	
	public static void bfs(int[][] edges) {
		
		int n = edges.length;
		boolean[] visited = new boolean[n];
		for(int i=0;i<edges.length;i++) {
			if(visited[i]==false) {
				bfsHelper(edges, i, visited);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int E = s.nextInt();
		int[][] edges = new int[n][n];
		for(int i=0;i<E;i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			edges[v1][v2] = 1;
			edges[v2][v1] = 1;
		}
		//dfs(edges);
		bfs(edges);
	}

}
