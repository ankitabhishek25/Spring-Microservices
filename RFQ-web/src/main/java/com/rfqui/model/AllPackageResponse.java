package com.rfqui.model;

import java.util.List;

public class AllPackageResponse {
private List<Packageee> list;

public AllPackageResponse() {
	super();
}

public AllPackageResponse(List<Packageee> list) {
	super();
	this.list = list;
}

public List<Packageee> getList() {
	return list;
}

public void setList(List<Packageee> list) {
	this.list = list;
}
}
