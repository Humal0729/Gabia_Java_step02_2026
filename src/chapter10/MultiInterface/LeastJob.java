package chapter10.MultiInterface;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("현재 상담업무가 없거나 상담대기 시간이 가장 작은 상담원에게 배분합니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		
	}

}
