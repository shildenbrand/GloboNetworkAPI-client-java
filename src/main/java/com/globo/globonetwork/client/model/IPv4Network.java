package com.globo.globonetwork.client.model;

import com.google.api.client.util.Key;

public class IPv4Network extends Network {
	
	@Key
	private Long id;
	
	@Key("vlan")
	private Long vlanId;
	
	@Key("network_type")
	private Long networkTypeId;

	@Key
	private Integer oct1;
	
	@Key
	private Integer oct2;
	
	@Key
	private Integer oct3;
	
	@Key
	private Integer oct4;
	
	@Key("mask_oct1")
	private Integer maskOct1;
	
	@Key("mask_oct2")
	private Integer maskOct2;
	
	@Key("mask_oct3")
	private Integer maskOct3;
	
	@Key("mask_oct4")
	private Integer maskOct4;
	
	@Key
	private String broadcast;
	
	@Key("ambient_vip")
	private Long vipEnvironmentId;
	
	@Key
	private Boolean active;
	
	@Key
	private Integer block;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVlanId() {
		return vlanId;
	}

	public void setVlanId(Long vlanId) {
		this.vlanId = vlanId;
	}

	public Long getNetworkTypeId() {
		return networkTypeId;
	}

	public void setNetworkTypeId(Long networkTypeId) {
		this.networkTypeId = networkTypeId;
	}

	public Integer getOct1() {
		return oct1;
	}

	public void setOct1(Integer oct1) {
		this.oct1 = oct1;
	}

	public Integer getOct2() {
		return oct2;
	}

	public void setOct2(Integer oct2) {
		this.oct2 = oct2;
	}

	public Integer getOct3() {
		return oct3;
	}

	public void setOct3(Integer oct3) {
		this.oct3 = oct3;
	}

	public Integer getOct4() {
		return oct4;
	}

	public void setOct4(Integer oct4) {
		this.oct4 = oct4;
	}

	public Integer getMaskOct1() {
		return maskOct1;
	}

	public void setMaskOct1(Integer maskOct1) {
		this.maskOct1 = maskOct1;
	}

	public Integer getMaskOct2() {
		return maskOct2;
	}

	public void setMaskOct2(Integer maskOct2) {
		this.maskOct2 = maskOct2;
	}

	public Integer getMaskOct3() {
		return maskOct3;
	}

	public void setMaskOct3(Integer maskOct3) {
		this.maskOct3 = maskOct3;
	}

	public Integer getMaskOct4() {
		return maskOct4;
	}

	public void setMaskOct4(Integer maskOct4) {
		this.maskOct4 = maskOct4;
	}

	public String getBroadcast() {
		return broadcast;
	}

	public void setBroadcast(String broadcast) {
		this.broadcast = broadcast;
	}

	public Long getVipEnvironmentId() {
		return vipEnvironmentId;
	}

	public void setVipEnvironmentId(Long vipEnvironmentId) {
		this.vipEnvironmentId = vipEnvironmentId;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getBlock() {
		return block;
	}

	public void setBlock(Integer block) {
		this.block = block;
	}
	
	public IPv4Network() {
		super.name = "redeipv4";
	}
}
