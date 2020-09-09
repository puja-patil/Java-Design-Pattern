package com.designpattern.behavioural.state;

public class StatePattern {
	static class FanWallControl {
		private SpeedLevel current;

		public FanWallControl() {
			current = new Off();
		}

		public void setState(SpeedLevel state) {
			current = state;
		}

		public void rotate() {
			current.rotate(this);
		}
	}

	public interface SpeedLevel {
		void rotate(FanWallControl fanWallControl);
	}

	static class Off implements SpeedLevel {
		@Override
		public void rotate(FanWallControl fanWallControl) {
			fanWallControl.setState(new SpeedLevel1());
			System.out.println("1");
		}
	}

	static class SpeedLevel1 implements SpeedLevel {
		@Override
		public void rotate(FanWallControl fanWallControl) {
			fanWallControl.setState(new SpeedLevel2());
			System.out.println("2");
		}
	}

	static class SpeedLevel2 implements SpeedLevel {
		@Override
		public void rotate(FanWallControl fanWallControl) {
			fanWallControl.setState(new SpeedLevel3());
			System.out.println("3");
		}
	}

	static class SpeedLevel3 implements SpeedLevel {
		@Override
		public void rotate(FanWallControl fanWallControl) {
			fanWallControl.setState(new Off());
			System.out.println("Off");
		}
	}
	
	public static void main(String[] args) {
		FanWallControl control = new FanWallControl();
		control.rotate();
		control.rotate();
		control.rotate();
		control.rotate();
	}

}
