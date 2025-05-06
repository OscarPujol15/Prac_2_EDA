package registers;

import dogs.Dog;

import java.util.HashMap;

public class DogRegisterImp implements DogRegister{


    public DogRegisterImp(){

        map<String, list<dog>> registres = new HashMap<>();

    }

    public boolean registerDog(String owner, Dog dog)throws UnknownOwnerException, DifferentOwnerException{
        if (!registres.containsKey(owner)){
            throw new UnknownOwnerException("El propietari no existeix");
        }

        Iterator<Dog> it = gossos.iterator();
        while (it.hasNext()){
            if (gossos.contains(dog)) {
                throw new DifferentOwnerException();
            }
    }
    return true;
    }

}
