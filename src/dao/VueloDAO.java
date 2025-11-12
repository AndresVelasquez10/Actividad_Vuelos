package dao;

import java.util.List;
import dto.Vuelo;

/**
 * DAO concreto para Vuelo, usa Persistencia<T> para serializar la lista.
 */
public class VueloDAO extends Persistencia<Vuelo> implements ICrud {

    public VueloDAO(String archivo) {
        super(archivo);
    }

    @Override
    public boolean crear(Object object) {
        if (!(object instanceof Vuelo)) return false;
        Vuelo v = (Vuelo) object;
        this.lista.add(v);
        guardar();
        return true;
    }

    @Override
    public Object leer(Object object) {
        // Soporta lectura por indice (Integer) o por referencia (Vuelo)
        if (object instanceof Integer) {
            int idx = (Integer) object;
            if (idx >= 0 && idx < lista.size()) return lista.get(idx);
            return null;
        }
        if (object instanceof Vuelo) {
            int idx = lista.indexOf(object);
            return idx >= 0 ? lista.get(idx) : null;
        }
        return null;
    }

    @Override
    public Object actualizar(int index, Object object) {
        if (index < 0 || index >= lista.size()) return null;
        lista.set(index, (Vuelo) object);
        guardar();
        return object;
    }

    @Override
    public boolean eliminar(Object object) {
        boolean removed = lista.remove(object);
        if (removed) guardar();
        return removed;
    }

    @Override
    public int buscarIndex(Object object) {
        return lista.indexOf(object);
    }

    @Override
    public List leerTodos() {
        return lista;
    }
}
