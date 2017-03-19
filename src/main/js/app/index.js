const React = require('react');
const ReactDOM = require('react-dom');
const axios = require('axios');

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {movies: []};
	}

	componentDidMount() {
		var self = this;
		axios.get('/api/movies')
		  .then(function (response) {
				console.log(response);
				console.log(self);
				self.setState({movies:response.data._embedded.movies});
		  })
		  .catch(function (error) {
		    console.log(error);
		  });
  }

	render() {
		return (
      <MoviesList movies={this.state.movies}/>
		)
	}
}

class MoviesList extends React.Component{
	render() {
		var movies = this.props.movies.map(movie =>
			<Movie key={movie._links.self.href} movie={movie}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Name</th>
						<th>Douban Score</th>
					</tr>
					{movies}
				</tbody>
			</table>
		)
	}
}

class Movie extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.movie.name}</td>
				<td>{this.props.movie.dbScore}</td>
			</tr>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)
