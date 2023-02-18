/**
 * 
 */
package projects;

import projects.dao.DbConnection;

/**
 * @author lixy4
 *
 */
public class ProjectsApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DbConnection.getConnection();

	}

}
