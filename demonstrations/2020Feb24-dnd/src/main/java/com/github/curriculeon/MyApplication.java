package com.github.curriculeon;

import com.github.curriculeon.models.dndclass.Bard;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		Bard bard = new Bard();
		System.out.println(bard);
	}
}
