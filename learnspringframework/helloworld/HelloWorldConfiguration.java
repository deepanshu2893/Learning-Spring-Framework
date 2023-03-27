package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration

public class HelloWorldConfiguration {

	@Bean

	public String name() {
		return "Deepanshu";
	}

	@Bean

	public int age() {
		return 28;
	}

	@Bean
	@Primary
	public Person person() {
		return new Person("Ashwani", 38, new Address("903, Abhinandan CGHS", "Gurgaon"));

	}

	@Bean

	public Person person2MethodCall() {
		return new Person(name(), age(), address()); // name, age

	}

	@Bean

	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3); // name, age

	}

	@Bean

	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address); // name, age

	}

	@Bean

	public Person person5Parameters(String name, int age, @Qualifier("addressee3qualifier") Address address) {
		return new Person(name, age, address); // name, age

	}

	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("903, Abhinandan CGHS, Sector 51", "Gurgaon, Haryana");
	}

	@Bean(name = "address3")
	@Qualifier("addressee3qualifier")
	public Address address3() {
		return new Address("Vipul World", "Gurgaon, Haryana");
	}
}
