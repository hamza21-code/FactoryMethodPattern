package com.example.abstractfactorymethod;

import com.example.creator.Animal;

public abstract  class AbstractAnimalFactoryMethod { // Factory Method patterns call Virtual Constructor. Where subclasses are responsible to create Objects Or Instance of Class.

    protected abstract Animal getAnimalType(String animalType);
}
