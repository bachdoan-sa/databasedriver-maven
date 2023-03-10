USE [MyWardrobe]
GO
/****** Object:  Table [dbo].[Accessory]    Script Date: 3/4/2023 12:52:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Accessory](
	[accesssoryID] [int] NOT NULL,
	[accesssoryName] [nvarchar](50) NULL,
	[characterID] [nvarchar](50) NULL,
	[type] [nvarchar](50) NULL,
	[description] [nvarchar](500) NULL,
	[accesssoryNote] [nvarchar](500) NULL,
 CONSTRAINT [PK_Accessory] PRIMARY KEY CLUSTERED 
(
	[accesssoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Character]    Script Date: 3/4/2023 12:52:21 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Character](
	[characterID] [nvarchar](50) NOT NULL,
	[characterName] [nvarchar](50) NULL,
	[description] [nvarchar](500) NULL,
 CONSTRAINT [PK_Character] PRIMARY KEY CLUSTERED 
(
	[characterID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Clothes]    Script Date: 3/4/2023 12:52:21 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Clothes](
	[clothesID] [int] NOT NULL,
	[clothesName] [nvarchar](50) NULL,
	[characterID] [nvarchar](50) NULL,
	[size] [int] NULL,
	[description] [nvarchar](500) NULL,
	[clothesNote] [nvarchar](500) NULL,
 CONSTRAINT [PK_Clothes] PRIMARY KEY CLUSTERED 
(
	[clothesID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Accessory] ([accesssoryID], [accesssoryName], [characterID], [type], [description], [accesssoryNote]) VALUES (1, N'hair tie', N'1', N'not update', N'not update', N'custom 1')
INSERT [dbo].[Accessory] ([accesssoryID], [accesssoryName], [characterID], [type], [description], [accesssoryNote]) VALUES (2, N'heavy sword', N'1', N'weapon', N'make from Styrofoam', N'custom 2')
INSERT [dbo].[Accessory] ([accesssoryID], [accesssoryName], [characterID], [type], [description], [accesssoryNote]) VALUES (3, N'pink lens', N'2', N'face custom', N'contact lens', N'custom 1')
INSERT [dbo].[Accessory] ([accesssoryID], [accesssoryName], [characterID], [type], [description], [accesssoryNote]) VALUES (4, N'yellow toupee', N'2', N'hair custom', N'1m long', N'custom 1')
INSERT [dbo].[Accessory] ([accesssoryID], [accesssoryName], [characterID], [type], [description], [accesssoryNote]) VALUES (5, N'purple black toupee', N'2', N'hair custom', N'1.2m long', N'custom 2')
INSERT [dbo].[Accessory] ([accesssoryID], [accesssoryName], [characterID], [type], [description], [accesssoryNote]) VALUES (6, NULL, NULL, N'not update', N'not update', N'not update')
GO
INSERT [dbo].[Character] ([characterID], [characterName], [description]) VALUES (N'1', N'Chtholly', N'Shuumatsu nani shitemasu ka')
INSERT [dbo].[Character] ([characterID], [characterName], [description]) VALUES (N'2', N'Marin Kitagawa', N'My Dress-Up Darling')
INSERT [dbo].[Character] ([characterID], [characterName], [description]) VALUES (N'3', N'Elysia', N'Honkai Impact 3rd')
INSERT [dbo].[Character] ([characterID], [characterName], [description]) VALUES (N'4', N'Lumine', N'Genshin Impact')
INSERT [dbo].[Character] ([characterID], [characterName], [description]) VALUES (N'5', N'Shin Jia', N'Counter: Side')
INSERT [dbo].[Character] ([characterID], [characterName], [description]) VALUES (N'6', N'Misuzu Gundou', N'Tomo-chan wa Onnanoko')
GO
INSERT [dbo].[Clothes] ([clothesID], [clothesName], [characterID], [size], [description], [clothesNote]) VALUES (1, N'none', N'1', 0, N'nothing here, just a special hentai custom', N'special custom')
GO
ALTER TABLE [dbo].[Accessory]  WITH CHECK ADD  CONSTRAINT [FK_Accessory_Character] FOREIGN KEY([characterID])
REFERENCES [dbo].[Character] ([characterID])
GO
ALTER TABLE [dbo].[Accessory] CHECK CONSTRAINT [FK_Accessory_Character]
GO
ALTER TABLE [dbo].[Clothes]  WITH CHECK ADD  CONSTRAINT [FK_Clothes_Character] FOREIGN KEY([characterID])
REFERENCES [dbo].[Character] ([characterID])
GO
ALTER TABLE [dbo].[Clothes] CHECK CONSTRAINT [FK_Clothes_Character]
GO
