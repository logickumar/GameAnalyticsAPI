/**
 * (C) 2015 NPException
 */
package de.npe.gameanalytics.events;

import com.google.gson.annotations.SerializedName;

import de.npe.gameanalytics.Analytics;


/**
 * @author NPException
 *
 */
public class GADesignEvent extends GAEventWithID {

	@SerializedName("area")
	private String area;

	@SerializedName("value")
	private Float value;

	public GADesignEvent(Analytics an, String eventID, String area, Float value) {
		super(an, eventID);
		this.area = area;
		this.value = value;
	}

	@Override
	public String category() {
		return "design";
	}
}