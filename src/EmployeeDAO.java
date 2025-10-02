import java.sql.*;

public class EmployeeDAO {

    // CREATE
    public void addEmployee(String name, String email, double salary) {
        String sql = "INSERT INTO employees(name, email, salary) VALUES (?, ?, ?)";
        try (Connection conn = connection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setDouble(3, salary);
            ps.executeUpdate();
            System.out.println("✅ Employee added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ
    public void viewEmployees() {
        String sql = "SELECT * FROM employees";
        try (Connection conn = connection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("email") + " | " +
                        rs.getDouble("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateEmployee(int id, double newSalary) {
        String sql = "UPDATE employees SET salary=? WHERE id=?";
        try (Connection conn = connection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, newSalary);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "✅ Employee updated!" : "⚠️ Employee not found!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employees WHERE id=?";
        try (Connection conn = connection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "✅ Employee deleted!" : "⚠️ Employee not found!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
