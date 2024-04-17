package com.wathare.entity;

public class JsonData {
	private String ts;
	private int machine_status;
	private int vibration;
	public JsonData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JsonData(String ts, int machine_status, int vibration) {
		super();
		this.ts = ts;
		this.machine_status = machine_status;
		this.vibration = vibration;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public int getMachine_status() {
		return machine_status;
	}
	public void setMachine_status(int machine_status) {
		this.machine_status = machine_status;
	}
	public int getVibration() {
		return vibration;
	}
	public void setVibration(int vibration) {
		this.vibration = vibration;
	}
	@Override
	public String toString() {
		return "JsonData [ts=" + ts + ", machine_status=" + machine_status + ", vibration=" + vibration + "]";
	}
}
