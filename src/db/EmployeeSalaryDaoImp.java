package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dto.EmployeeSalary;

public class EmployeeSalaryDaoImp implements EmployeeSalaryDao {

	private Connection connection;

	@Override
	public List<EmployeeSalary> employeeList() {
		List<EmployeeSalary> employeeSalaryList = new ArrayList<>();
		connection = ConnectionFactory.getConnection();
		PreparedStatement preparedStatement;

		try {
			preparedStatement = connection.prepareStatement(
					"SELECT Funcionario.*, (SELECT SUM(valor_desconto) FROM Descontos WHERE Funcionario.id_cliente = Descontos.id_cliente) desconto FROM Funcionario;");
			ResultSet resultSet = preparedStatement.executeQuery();
			EmployeeSalary employeeSalary = null;
			while (resultSet.next()) {
				employeeSalary = new EmployeeSalary();
				employeeSalary.setClientId(resultSet.getInt("id_cliente"));
				employeeSalary.setClientName(resultSet.getString("nm_cliente"));
				employeeSalary.setGrossSalary(resultSet.getBigDecimal("vl_salario_bruto"));
				employeeSalary.setDiscounts(resultSet.getBigDecimal("desconto"));

				employeeSalaryList.add(employeeSalary);
			}
			resultSet.close();
			preparedStatement.close();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				connection.close();

			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
		return employeeSalaryList;
	}

}
