package com.api.models.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum_
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
	@SerializedName("sunriseTime")
	@Expose
	private Float sunriseTime;
	@SerializedName("sunsetTime")
	@Expose
	private Float sunsetTime;
	@SerializedName("moonPhase")
	@Expose
	private Double moonPhase;
	@SerializedName("precipIntensity")
	@Expose
	private Float precipIntensity;
	@SerializedName("precipIntensityMax")
	@Expose
	private Float precipIntensityMax;
	@SerializedName("precipProbability")
	@Expose
	private Float precipProbability;
	@SerializedName("temperatureHigh")
	@Expose
	private Double temperatureHigh;
	@SerializedName("temperatureHighTime")
	@Expose
	private Float temperatureHighTime;
	@SerializedName("temperatureLow")
	@Expose
	private Double temperatureLow;
	@SerializedName("temperatureLowTime")
	@Expose
	private Float temperatureLowTime;
	@SerializedName("apparentTemperatureHigh")
	@Expose
	private Double apparentTemperatureHigh;
	@SerializedName("apparentTemperatureHighTime")
	@Expose
	private Float apparentTemperatureHighTime;
	@SerializedName("apparentTemperatureLow")
	@Expose
	private Double apparentTemperatureLow;
	@SerializedName("apparentTemperatureLowTime")
	@Expose
	private Float apparentTemperatureLowTime;
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
	@SerializedName("windGustTime")
	@Expose
	private Float windGustTime;
	@SerializedName("windBearing")
	@Expose
	private Float windBearing;
	@SerializedName("cloudCover")
	@Expose
	private Float cloudCover;
	@SerializedName("uvIndex")
	@Expose
	private Float uvIndex;
	@SerializedName("uvIndexTime")
	@Expose
	private Float uvIndexTime;
	@SerializedName("visibility")
	@Expose
	private Float visibility;
	@SerializedName("ozone")
	@Expose
	private Double ozone;
	@SerializedName("temperatureMin")
	@Expose
	private Double temperatureMin;
	@SerializedName("temperatureMinTime")
	@Expose
	private Float temperatureMinTime;
	@SerializedName("temperatureMax")
	@Expose
	private Double temperatureMax;
	@SerializedName("temperatureMaxTime")
	@Expose
	private Float temperatureMaxTime;
	@SerializedName("apparentTemperatureMin")
	@Expose
	private Double apparentTemperatureMin;
	@SerializedName("apparentTemperatureMinTime")
	@Expose
	private Float apparentTemperatureMinTime;
	@SerializedName("apparentTemperatureMax")
	@Expose
	private Double apparentTemperatureMax;
	@SerializedName("apparentTemperatureMaxTime")
	@Expose
	private Float apparentTemperatureMaxTime;
	@SerializedName("precipIntensityMaxTime")
	@Expose
	private Float precipIntensityMaxTime;

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

	public Float getSunriseTime()
	{
		return sunriseTime;
	}

	public void setSunriseTime(Float sunriseTime)
	{
		this.sunriseTime = sunriseTime;
	}

	public Float getSunsetTime()
	{
		return sunsetTime;
	}

	public void setSunsetTime(Float sunsetTime)
	{
		this.sunsetTime = sunsetTime;
	}

	public Double getMoonPhase()
	{
		return moonPhase;
	}

	public void setMoonPhase(Double moonPhase)
	{
		this.moonPhase = moonPhase;
	}

	public Float getPrecipIntensity()
	{
		return precipIntensity;
	}

	public void setPrecipIntensity(Float precipIntensity)
	{
		this.precipIntensity = precipIntensity;
	}

	public Float getPrecipIntensityMax()
	{
		return precipIntensityMax;
	}

	public void setPrecipIntensityMax(Float precipIntensityMax)
	{
		this.precipIntensityMax = precipIntensityMax;
	}

	public Float getPrecipProbability()
	{
		return precipProbability;
	}

	public void setPrecipProbability(Float precipProbability)
	{
		this.precipProbability = precipProbability;
	}

	public Double getTemperatureHigh()
	{
		return temperatureHigh;
	}

	public void setTemperatureHigh(Double temperatureHigh)
	{
		this.temperatureHigh = temperatureHigh;
	}

	public Float getTemperatureHighTime()
	{
		return temperatureHighTime;
	}

	public void setTemperatureHighTime(Float temperatureHighTime)
	{
		this.temperatureHighTime = temperatureHighTime;
	}

	public Double getTemperatureLow()
	{
		return temperatureLow;
	}

	public void setTemperatureLow(Double temperatureLow)
	{
		this.temperatureLow = temperatureLow;
	}

	public Float getTemperatureLowTime()
	{
		return temperatureLowTime;
	}

	public void setTemperatureLowTime(Float temperatureLowTime)
	{
		this.temperatureLowTime = temperatureLowTime;
	}

	public Double getApparentTemperatureHigh()
	{
		return apparentTemperatureHigh;
	}

	public void setApparentTemperatureHigh(Double apparentTemperatureHigh)
	{
		this.apparentTemperatureHigh = apparentTemperatureHigh;
	}

	public Float getApparentTemperatureHighTime()
	{
		return apparentTemperatureHighTime;
	}

	public void setApparentTemperatureHighTime(Float apparentTemperatureHighTime)
	{
		this.apparentTemperatureHighTime = apparentTemperatureHighTime;
	}

	public Double getApparentTemperatureLow()
	{
		return apparentTemperatureLow;
	}

	public void setApparentTemperatureLow(Double apparentTemperatureLow)
	{
		this.apparentTemperatureLow = apparentTemperatureLow;
	}

	public Float getApparentTemperatureLowTime()
	{
		return apparentTemperatureLowTime;
	}

	public void setApparentTemperatureLowTime(Float apparentTemperatureLowTime)
	{
		this.apparentTemperatureLowTime = apparentTemperatureLowTime;
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

	public Float getWindGustTime()
	{
		return windGustTime;
	}

	public void setWindGustTime(Float windGustTime)
	{
		this.windGustTime = windGustTime;
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

	public Float getUvIndexTime()
	{
		return uvIndexTime;
	}

	public void setUvIndexTime(Float uvIndexTime)
	{
		this.uvIndexTime = uvIndexTime;
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

	public Double getTemperatureMin()
	{
		return temperatureMin;
	}

	public void setTemperatureMin(Double temperatureMin)
	{
		this.temperatureMin = temperatureMin;
	}

	public Float getTemperatureMinTime()
	{
		return temperatureMinTime;
	}

	public void setTemperatureMinTime(Float temperatureMinTime)
	{
		this.temperatureMinTime = temperatureMinTime;
	}

	public Double getTemperatureMax()
	{
		return temperatureMax;
	}

	public void setTemperatureMax(Double temperatureMax)
	{
		this.temperatureMax = temperatureMax;
	}

	public Float getTemperatureMaxTime()
	{
		return temperatureMaxTime;
	}

	public void setTemperatureMaxTime(Float temperatureMaxTime)
	{
		this.temperatureMaxTime = temperatureMaxTime;
	}

	public Double getApparentTemperatureMin()
	{
		return apparentTemperatureMin;
	}

	public void setApparentTemperatureMin(Double apparentTemperatureMin)
	{
		this.apparentTemperatureMin = apparentTemperatureMin;
	}

	public Float getApparentTemperatureMinTime()
	{
		return apparentTemperatureMinTime;
	}

	public void setApparentTemperatureMinTime(Float apparentTemperatureMinTime)
	{
		this.apparentTemperatureMinTime = apparentTemperatureMinTime;
	}

	public Double getApparentTemperatureMax()
	{
		return apparentTemperatureMax;
	}

	public void setApparentTemperatureMax(Double apparentTemperatureMax)
	{
		this.apparentTemperatureMax = apparentTemperatureMax;
	}

	public Float getApparentTemperatureMaxTime()
	{
		return apparentTemperatureMaxTime;
	}

	public void setApparentTemperatureMaxTime(Float apparentTemperatureMaxTime)
	{
		this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
	}

	public Float getPrecipIntensityMaxTime()
	{
		return precipIntensityMaxTime;
	}

	public void setPrecipIntensityMaxTime(Float precipIntensityMaxTime)
	{
		this.precipIntensityMaxTime = precipIntensityMaxTime;
	}

}
