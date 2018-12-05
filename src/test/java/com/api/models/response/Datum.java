package com.api.models.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum
{

	@SerializedName("time")
	@Expose
	private Float time;
	@SerializedName("summary")
	@Expose
	private String summary;
	@SerializedName("icon")
	@Expose
	private String icon;
	@SerializedName("precipIntensity")
	@Expose
	private Float precipIntensity;
	@SerializedName("precipProbability")
	@Expose
	private Float precipProbability;
	@SerializedName("temperature")
	@Expose
	private Double temperature;
	@SerializedName("apparentTemperature")
	@Expose
	private Double apparentTemperature;
	@SerializedName("dewPoint")
	@Expose
	private Double dewPoint;
	@SerializedName("humidity")
	@Expose
	private Double humidity;
	@SerializedName("pressure")
	@Expose
	private Double pressure;
	@SerializedName("windSpeed")
	@Expose
	private Double windSpeed;
	@SerializedName("windGust")
	@Expose
	private Double windGust;
	@SerializedName("windBearing")
	@Expose
	private Float windBearing;
	@SerializedName("cloudCover")
	@Expose
	private Float cloudCover;
	@SerializedName("uvIndex")
	@Expose
	private Float uvIndex;
	@SerializedName("visibility")
	@Expose
	private Float visibility;
	@SerializedName("ozone")
	@Expose
	private Double ozone;

	public Float getTime()
	{
		return time;
	}

	public void setTime(Float time)
	{
		this.time = time;
	}

	public String getSummary()
	{
		return summary;
	}

	public void setSummary(String summary)
	{
		this.summary = summary;
	}

	public String getIcon()
	{
		return icon;
	}

	public void setIcon(String icon)
	{
		this.icon = icon;
	}

	public Float getPrecipIntensity()
	{
		return precipIntensity;
	}

	public void setPrecipIntensity(Float precipIntensity)
	{
		this.precipIntensity = precipIntensity;
	}

	public Float getPrecipProbability()
	{
		return precipProbability;
	}

	public void setPrecipProbability(Float precipProbability)
	{
		this.precipProbability = precipProbability;
	}

	public Double getTemperature()
	{
		return temperature;
	}

	public void setTemperature(Double temperature)
	{
		this.temperature = temperature;
	}

	public Double getApparentTemperature()
	{
		return apparentTemperature;
	}

	public void setApparentTemperature(Double apparentTemperature)
	{
		this.apparentTemperature = apparentTemperature;
	}

	public Double getDewPoint()
	{
		return dewPoint;
	}

	public void setDewPoint(Double dewPoint)
	{
		this.dewPoint = dewPoint;
	}

	public Double getHumidity()
	{
		return humidity;
	}

	public void setHumidity(Double humidity)
	{
		this.humidity = humidity;
	}

	public Double getPressure()
	{
		return pressure;
	}

	public void setPressure(Double pressure)
	{
		this.pressure = pressure;
	}

	public Double getWindSpeed()
	{
		return windSpeed;
	}

	public void setWindSpeed(Double windSpeed)
	{
		this.windSpeed = windSpeed;
	}

	public Double getWindGust()
	{
		return windGust;
	}

	public void setWindGust(Double windGust)
	{
		this.windGust = windGust;
	}

	public Float getWindBearing()
	{
		return windBearing;
	}

	public void setWindBearing(Float windBearing)
	{
		this.windBearing = windBearing;
	}

	public Float getCloudCover()
	{
		return cloudCover;
	}

	public void setCloudCover(Float cloudCover)
	{
		this.cloudCover = cloudCover;
	}

	public Float getUvIndex()
	{
		return uvIndex;
	}

	public void setUvIndex(Float uvIndex)
	{
		this.uvIndex = uvIndex;
	}

	public Float getVisibility()
	{
		return visibility;
	}

	public void setVisibility(Float visibility)
	{
		this.visibility = visibility;
	}

	public Double getOzone()
	{
		return ozone;
	}

	public void setOzone(Double ozone)
	{
		this.ozone = ozone;
	}

}
