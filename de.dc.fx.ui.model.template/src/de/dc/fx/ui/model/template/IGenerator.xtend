package de.dc.fx.ui.model.template

interface IGenerator<T> {
	
	def String gen(T data)
}