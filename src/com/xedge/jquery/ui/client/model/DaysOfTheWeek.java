package com.xedge.jquery.ui.client.model;
	public enum DaysOfTheWeek {
		Sunday(0),
		Monday(1),
		Tuesday(2),
		Wednesday(3),
		Thursday(4),
		Friday(5),
		Saturday(6);
		private int day;

		DaysOfTheWeek(int day) {
			this.day = day;
		}

		public int getDay() {
			return day;
		}
		
		public static DaysOfTheWeek getDaysOfTheWeek(int day) {
			DaysOfTheWeek daysOfTheWeek = null;
			for (DaysOfTheWeek daysOfTheWeekValue : values()) {
				if(daysOfTheWeekValue.getDay()==day){
					daysOfTheWeek=daysOfTheWeekValue;
					return daysOfTheWeek;
				}
			}
			return daysOfTheWeek;
		}
	}
