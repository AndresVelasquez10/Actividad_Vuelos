package dao;

	import java.util.List;

	public interface ICrud {
		/**
		 * Función para adicionar al final de la lista un objeto
		 * @param object
		 * @return
		 */
		public boolean crear(Object object);
		
		/**
		 * Función para buscar un objeto en la lista
		 * @param object
		 * @return
		 */
		public Object leer(Object object);
		
		/**
		 * Función para modificar un objeto de la lista
		 * @param index
		 * @param object
		 * @return 
		 */
		public Object actualizar(int index,Object object);
		
		/**
		 * Función para borrar un objeto de la lista
		 * @param object
		 * @return true si borro o false si no borro
		 */
		public boolean eliminar(Object object);
		
		/**
		 * Obtiene la posición de un objeto en el lista
		 * @param object a buscar
		 * @return int posición
		 */
		public int buscarIndex(Object object);
		
		/**
		 * Retorna la instancia de la lista
		 * @return
		 */
		public List leerTodos();
		
		
		
	}
