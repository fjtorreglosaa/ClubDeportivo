package Pilas;

import java.util.ArrayList;
import java.util.List;

public class clsPila<T>
{
    private List<T> _list = new ArrayList<T>();

    public int Count = _list.size();

    public void PonerElemento(T obj){
        if(obj == null){
            throw new NullPointerException("El objeto no puede ser nulo");
        }
        _list.add(obj);
    }

    public T QuitarElemento(){
        if (_list.size() == 0){
            throw new NullPointerException("La pila no tiene objetos");
        }

        var result = _list.get(_list.size()-1);
        _list.remove(_list.size()-1);

        return result;
    }

    public T PicoDeLaPila(){
        if(_list.size()==0){
            throw new NullPointerException("La pila no tiene objetos");
        }

        return _list.get(_list.size()-1);
    }

}
