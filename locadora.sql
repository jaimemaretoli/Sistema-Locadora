-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 11-Ago-2015 às 18:56
-- Versão do servidor: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `locadora`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `id_cliente` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `obs` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `nome`, `email`, `telefone`, `data_nascimento`, `obs`) VALUES
(1, 'Roberto', 'roberto@roberto.com', '(55) 1234-5678', '2003-02-01', 'asdasdasdasd'),
(2, 'Julio', 'julio@julio.com.br', '(55) 2222-2222', '1888-09-07', 'Bom comprador, sempre paga em dia');

-- --------------------------------------------------------

--
-- Estrutura da tabela `filmes`
--

CREATE TABLE IF NOT EXISTS `filmes` (
  `id_filme` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `tipo_filme` varchar(50) DEFAULT NULL,
  `data_lancamento` date DEFAULT NULL,
  `elenco` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `filmes`
--

INSERT INTO `filmes` (`id_filme`, `nome`, `tipo_filme`, `data_lancamento`, `elenco`) VALUES
(1, 'Alvin e os Esquilos', 'Animação', '2001-03-01', 'Alvin, Theodore, Simon'),
(2, 'Harry Potter', 'Ação', '2000-01-02', 'João, Oliva, Harry');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionarios`
--

CREATE TABLE IF NOT EXISTS `funcionarios` (
  `id_funcionario` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `telefone` varchar(50) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `usuario` varchar(50) DEFAULT NULL,
  `senha` varchar(50) NOT NULL,
  `nivel_acesso` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionarios`
--

INSERT INTO `funcionarios` (`id_funcionario`, `nome`, `telefone`, `email`, `usuario`, `senha`, `nivel_acesso`) VALUES
(1, 'João da Silva', '(55) 1111-1111', 'joaodasilva@joao.com', 'joaodasilva', '12345678', 1),
(2, 'Roberto Antunes', '(55) 9999-9999', 'roberto@antunes.com', 'robertoantunes', '123456789', 2),
(3, 'Julio da Silveira', '(55) 4444-4444', 'julio@julio.com', 'julio_julio', '25376524', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `locacao_filmes`
--

CREATE TABLE IF NOT EXISTS `locacao_filmes` (
  `id_locacao` int(11) NOT NULL,
  `id_filme` int(11) NOT NULL,
  `id_funcionario` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `data_locacao` date DEFAULT NULL,
  `data_entrega` date DEFAULT NULL,
  `valor` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `locacao_filmes`
--

INSERT INTO `locacao_filmes` (`id_locacao`, `id_filme`, `id_funcionario`, `id_cliente`, `data_locacao`, `data_entrega`, `valor`) VALUES
(1, 1, 1, 1, '2015-03-04', '2015-03-07', 3.5),
(2, 2, 2, 2, '2015-03-05', '2015-03-07', 3.5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
 ADD PRIMARY KEY (`id_cliente`);

--
-- Indexes for table `filmes`
--
ALTER TABLE `filmes`
 ADD PRIMARY KEY (`id_filme`);

--
-- Indexes for table `funcionarios`
--
ALTER TABLE `funcionarios`
 ADD PRIMARY KEY (`id_funcionario`);

--
-- Indexes for table `locacao_filmes`
--
ALTER TABLE `locacao_filmes`
 ADD PRIMARY KEY (`id_locacao`), ADD KEY `id_filme` (`id_filme`), ADD KEY `id_funcionario` (`id_funcionario`), ADD KEY `id_cliente` (`id_cliente`);

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `locacao_filmes`
--
ALTER TABLE `locacao_filmes`
ADD CONSTRAINT `locacao_filmes_ibfk_1` FOREIGN KEY (`id_filme`) REFERENCES `filmes` (`id_filme`),
ADD CONSTRAINT `locacao_filmes_ibfk_2` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionarios` (`id_funcionario`),
ADD CONSTRAINT `locacao_filmes_ibfk_3` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
