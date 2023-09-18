USE [LuminousHorizons]
GO
/****** Object:  User [TestLuminousHorizons]    Script Date: 18/09/2023 14:41:32 ******/
CREATE USER [TestLuminousHorizons] FOR LOGIN [TestLuminousHorizons] WITH DEFAULT_SCHEMA=[dbo]
GO
ALTER ROLE [db_datareader] ADD MEMBER [TestLuminousHorizons]
GO
ALTER ROLE [db_datawriter] ADD MEMBER [TestLuminousHorizons]
GO
/****** Object:  Table [dbo].[Clientes]    Script Date: 18/09/2023 14:41:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Clientes](
	[Id_cliente] [int] NOT NULL,
	[Nombre] [varchar](50) NOT NULL,
	[Apellido] [varchar](50) NOT NULL,
	[Genero] [varchar](10) NOT NULL,
	[Fecha_nacimiento] [smalldatetime] NOT NULL,
	[Direccion] [varchar](200) NOT NULL,
	[Estado_o_Provincia] [varchar](50) NOT NULL,
	[Codigo_postal] [varchar](10) NOT NULL,
	[Pais] [varchar](25) NOT NULL,
	[Numero_de_telefono] [varchar](20) NULL,
	[Correo_electronico] [varchar](50) NULL,
	[Id_usuario] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_cliente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Empleados]    Script Date: 18/09/2023 14:41:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Empleados](
	[Id_empleado] [int] NOT NULL,
	[Nombre] [varchar](50) NOT NULL,
	[Apellido] [varchar](50) NOT NULL,
	[Puesto] [varchar](50) NOT NULL,
	[Fecha_de_contratacion] [smalldatetime] NOT NULL,
	[Numero_de_telefono] [varchar](20) NULL,
	[Correo_electronico] [varchar](50) NULL,
	[Id_usuario] [int] NOT NULL,
	[Genero] [varchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_empleado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Reservas]    Script Date: 18/09/2023 14:41:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Reservas](
	[Id_reserva] [int] NOT NULL,
	[Id_cliente] [int] NOT NULL,
	[Id_viaje] [int] NOT NULL,
	[Fecha_de_reserva] [smalldatetime] NOT NULL,
	[Fecha_de_viaje] [smalldatetime] NOT NULL,
	[Destino] [varchar](25) NOT NULL,
	[Numero_de_pasajero] [int] NOT NULL,
	[Estado_de_la_reserva] [varchar](25) NOT NULL,
	[Precio_total] [decimal](10, 2) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_reserva] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Usuarios]    Script Date: 18/09/2023 14:41:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Usuarios](
	[Id_usuario] [int] NOT NULL,
	[Nombre_de_usuario] [nvarchar](50) NOT NULL,
	[Clave] [nvarchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_usuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Viajes]    Script Date: 18/09/2023 14:41:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Viajes](
	[Id_viaje] [int] NOT NULL,
	[Destino] [varchar](25) NOT NULL,
	[Fecha_de_salida] [smalldatetime] NOT NULL,
	[Fecha_de_regreso] [smalldatetime] NOT NULL,
	[Precio_por_pasajero] [decimal](10, 2) NOT NULL,
	[Disponibilidad_de_plazas] [char](2) NOT NULL,
	[Descripcion_del_viaje] [varchar](225) NULL,
	[Tipo_de_viaje] [varchar](100) NOT NULL,
	[Hotel] [varchar](100) NULL,
	[Itinerario] [varchar](225) NULL,
	[Id_empleado] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_viaje] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Empleados] ([Id_empleado], [Nombre], [Apellido], [Puesto], [Fecha_de_contratacion], [Numero_de_telefono], [Correo_electronico], [Id_usuario], [Genero]) VALUES (1, N'Juan Bladimir', N'Romero Collazos', N'Dueño', CAST(N'2023-08-16T00:00:00' AS SmallDateTime), N'+51945759693', N'juanromerocollazos@gmail.com', 1, N'Hombre')
GO
INSERT [dbo].[Usuarios] ([Id_usuario], [Nombre_de_usuario], [Clave]) VALUES (1, N'Admin', N'88a030409bc3ed80917984710e4b95bb5f779c41441b60be7f7030fbcb54326e:53849ff0b3d3ac41e79766b278fab45f')
GO
/****** Object:  Index [UQ__Clientes__FCE0399372A05D4C]    Script Date: 18/09/2023 14:41:33 ******/
ALTER TABLE [dbo].[Clientes] ADD UNIQUE NONCLUSTERED 
(
	[Id_cliente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [UQ__Empleado__01AC282847F0ABE9]    Script Date: 18/09/2023 14:41:33 ******/
ALTER TABLE [dbo].[Empleados] ADD UNIQUE NONCLUSTERED 
(
	[Id_empleado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [UQ__Reservas__05B70836FB2D9983]    Script Date: 18/09/2023 14:41:33 ******/
ALTER TABLE [dbo].[Reservas] ADD UNIQUE NONCLUSTERED 
(
	[Id_reserva] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__Usuarios__32C80AF6CB991106]    Script Date: 18/09/2023 14:41:33 ******/
ALTER TABLE [dbo].[Usuarios] ADD UNIQUE NONCLUSTERED 
(
	[Nombre_de_usuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [UQ__Usuarios__EF59F7639A5FB875]    Script Date: 18/09/2023 14:41:33 ******/
ALTER TABLE [dbo].[Usuarios] ADD UNIQUE NONCLUSTERED 
(
	[Id_usuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [UQ__Viajes__00C488B92F1AF4E3]    Script Date: 18/09/2023 14:41:33 ******/
ALTER TABLE [dbo].[Viajes] ADD UNIQUE NONCLUSTERED 
(
	[Id_viaje] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Empleados] ADD  DEFAULT ('Hombre') FOR [Genero]
GO
ALTER TABLE [dbo].[Clientes]  WITH CHECK ADD FOREIGN KEY([Id_usuario])
REFERENCES [dbo].[Usuarios] ([Id_usuario])
GO
ALTER TABLE [dbo].[Empleados]  WITH CHECK ADD FOREIGN KEY([Id_usuario])
REFERENCES [dbo].[Usuarios] ([Id_usuario])
GO
ALTER TABLE [dbo].[Reservas]  WITH CHECK ADD  CONSTRAINT [FK_CLIENTES_RESERVAS] FOREIGN KEY([Id_cliente])
REFERENCES [dbo].[Clientes] ([Id_cliente])
GO
ALTER TABLE [dbo].[Reservas] CHECK CONSTRAINT [FK_CLIENTES_RESERVAS]
GO
ALTER TABLE [dbo].[Reservas]  WITH CHECK ADD  CONSTRAINT [FK_VIAJES_RESERVAS] FOREIGN KEY([Id_viaje])
REFERENCES [dbo].[Viajes] ([Id_viaje])
GO
ALTER TABLE [dbo].[Reservas] CHECK CONSTRAINT [FK_VIAJES_RESERVAS]
GO
ALTER TABLE [dbo].[Viajes]  WITH CHECK ADD  CONSTRAINT [FK_EMPLEADOS_VIAJES] FOREIGN KEY([Id_empleado])
REFERENCES [dbo].[Empleados] ([Id_empleado])
GO
ALTER TABLE [dbo].[Viajes] CHECK CONSTRAINT [FK_EMPLEADOS_VIAJES]
GO
