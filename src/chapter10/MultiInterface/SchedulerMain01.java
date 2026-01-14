package chapter10.MultiInterface;

import java.util.Scanner;

public class SchedulerMain01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean run = true;
		Scheduler L = new LeastJob();
		Scheduler R = new RoundRobin();
		Scheduler P = new PriorityAllocation();
		
		while(run == true) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			
			char input = s.next().toUpperCase().charAt(0);
			int c = (int)input;
			
			switch (c) {
			case 'R', 'r': Run(R); break;
			case 'L', 'l': Run(L); break;
			case 'P', 'p': Run(P); break;
			case 'S', 's': System.out.println("시스템 종료"); run = false; break;
			default: System.out.println("그런 서비스는 없습니다");
			}
		}

	}
	public static void Run(Scheduler SC) {
		SC.getNextCall();
		SC.sendCallToAgent();
	}

}
