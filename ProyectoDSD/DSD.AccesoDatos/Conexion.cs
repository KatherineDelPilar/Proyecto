using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data.SqlClient;
using System.Configuration;

public class Conexion
{
    public static SqlConnection obtenerConexion()
    {
        //String servidor = ConfigurationManager.AppSettings.Get("DSD_ServidorBaseDatos"); ;
        //String baseDatos = ConfigurationManager.AppSettings.Get("DSD_BaseDatos");

        String servidor = "NVR-DES\\SQLSERVER2008";
        String baseDatos = "Android93";

        string cadenaConexion = "Data Source=" + servidor + ";Initial Catalog=" + baseDatos + ";Integrated Security=True";
        try
        {
            SqlConnection cn = new SqlConnection(cadenaConexion);
            cn.Open();
            return cn;
        }
        catch (Exception e)
        {
            return null;
        }
    }
}

