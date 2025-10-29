package com.thejoa703.dto;

import java.sql.*;
import java.util.ArrayList;

public class PostDao {
	// 1. 글쓰기: 
	
	public int insert(PostDto dto) {
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pass = "tiger";
		String sql = "insert into post (id, app_user_id, title, content, pass) values (post_seq.nextval, ?, ?, ?, ?)";
		try {
			// 1. 드라이버 연동
			Class.forName(driver);
			// 2. 커넥션
			conn = DriverManager.getConnection(url, user, pass);
			//3. pstmt
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getAppUserId());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getPass());
			// 4.rset
			if(pstmt.executeUpdate()>0) {result=1;}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(rset != null) {try {rset.close();} catch (SQLException e) {e.printStackTrace();}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		return result;
	}
	

	// 2. 전체글 가져오기, appuser 테이블에서 email도 같이 가져오기
	// select p.*, email, from post p join appuser u using(app_user_id);
	public ArrayList<PostDto> selectAll(){
		ArrayList<PostDto> result = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pass = "tiger";
		String sql ="SELECT p.*, u.email email " +
			    	    "FROM post p LEFT JOIN appuser u " +
			    	    "ON p.app_user_id = u.app_user_id";
				
		try {
			// 1. 드라이버 연동
			Class.forName(driver);
			// 2. 커넥션
			conn = DriverManager.getConnection(url, user, pass);
			//3. pstmt
			pstmt = conn.prepareStatement(sql);
			// 4.rset
			rset = pstmt.executeQuery();
		     while(rset.next()) { //줄
		            //  id,   appUserId,  / title,   content,   pass, LocalDateTime createdAt,   hit,  email
		            result.add( new PostDto( 
		                 rset.getInt("id") , rset.getInt("app_user_id") 
		               , rset.getString("title"), rset.getString("content"), rset.getString("pass")
		               , rset.getTimestamp("created_at").toLocalDateTime() 
		               , rset.getInt("hit") , rset.getString("email") 
		            ));
		         } 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		    if (rset != null) try { rset.close(); } catch (SQLException e) { e.printStackTrace(); }
		    if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
		    if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
	return result;}
	// 3. 글 번호 해당하는 글 가져오기
	// select * from post where id=?
	// update post set hit=hit+1 where id=?
	public PostDto select(PostDto dto) {
		PostDto result = new PostDto();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pass = "tiger";
		String sql = "select * from post where id=?";
		try {
			// 1. 드라이버 연동
			Class.forName(driver);
			// 2. 커넥션
			conn = DriverManager.getConnection(url, user, pass);
			//3. pstmt
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getAppUserId());
			// 4.rset
			rset = pstmt.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(rset != null) {try {rset.close();} catch (SQLException e) {e.printStackTrace();}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		return result;
	}

	public int update_hit(PostDto dto) {
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pass = "tiger";
		String sql = "update post set hit=hit+1 where id=?";
		try {
			// 1. 드라이버 연동
			Class.forName(driver);
			// 2. 커넥션
			conn = DriverManager.getConnection(url, user, pass);
			//3. pstmt
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getAppUserId());
			// 4.rset
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(rset != null) {try {rset.close();} catch (SQLException e) {e.printStackTrace();}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		return result;
	}
	// 4. 글 수정하기
	// update post set title=?, content=? where id=? and pass=?
	public int update(PostDto dto) {
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pass = "tiger";
		String sql = "update post set title=?, content=? where id=? and pass=?";
		try {
			// 1. 드라이버 연동
			Class.forName(driver);
			// 2. 커넥션
			conn = DriverManager.getConnection(url, user, pass);
			//3. pstmt
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getAppUserId());
			pstmt.setString(4, dto.getPass());
			// 4.rset
			if(pstmt.executeUpdate()>0) {result=1;}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(rset != null) {try {rset.close();} catch (SQLException e) {e.printStackTrace();}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		return result;
	}
	// 5. 글 번호 해당하는 삭제
	// delete from post where id=? and pass=?
	public int delete(PostDto dto) {
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pass = "tiger";
		String sql = "delete from post where id=? and pass=?";
		try {
			// 1. 드라이버 연동
			Class.forName(driver);
			// 2. 커넥션
			conn = DriverManager.getConnection(url, user, pass);
			//3. pstmt
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getAppUserId());
			pstmt.setString(2, dto.getPass());
			// 4.rset
			if(pstmt.executeUpdate()>0) {result=1;}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(rset != null) {try {rset.close();} catch (SQLException e) {e.printStackTrace();}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		return result;
	}
}
