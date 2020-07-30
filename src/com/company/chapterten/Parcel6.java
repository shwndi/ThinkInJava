package com.company.chapterten;

/**
 * @author czy
 * @date 2020-7-30
 */
public class Parcel6 {
	private void internalTracking(boolean b){
		if(b){
			class TrakingSlip{
				private String id;
				TrakingSlip(String s){
					id = s;
				}
				String getSlip(){
					return id;
				}
			}
			TrakingSlip slip = new TrakingSlip("slip");
			String s = slip.getSlip();
		}

	}
		public void track(){
			internalTracking(true);
		}

	public static void main(String[] args) {
		Parcel6 parcel6 = new Parcel6();
		parcel6.track();
	}
}
