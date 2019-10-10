package pl.synchronize.model;

import javax.persistence.*;

@Entity
public class CoppiedData {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String data;
	
	CoppiedData(){}
	
	CoppiedData(String data){
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", data=" + data + "]";
	}
}
